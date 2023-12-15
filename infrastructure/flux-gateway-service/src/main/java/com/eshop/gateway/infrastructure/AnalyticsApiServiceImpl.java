package com.eshop.gateway.infrastructure;

import com.eshop.gateway.models.CatalogItem;
import com.eshop.gateway.services.AnalyticsApiService;
import com.eshop.gateway.services.CatalogApiService;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.UUID;

@CircuitBreaker(name = "catalog-query", fallbackMethod = "getFirst5ProductsFromCatalog")
@Retry(name = "catalog-query")
@RequiredArgsConstructor
@Service
public class AnalyticsApiServiceImpl implements AnalyticsApiService {
  private final WebClient.Builder analyticsWebClient;
  private final CatalogApiService catalogApiService;

  @Override
  public Flux<CatalogItem> getTopFiveProducts(String accessToken) {
    return analyticsWebClient.build()
        .get()
        .uri("http://analytics:9001/api/products/top-five")
        .headers(h -> {
          if (accessToken != null) {
            h.setBearerAuth(accessToken);
            //TODO: implement distributed tracing
            //h.set(CORRELATION_ID_HEADER, MDC.get(CORRELATION_ID_KEY));
          }
        })
        .retrieve()
        .bodyToFlux(Product.class)
        .map(Product::id)
        .collectList()
        .flatMapMany(catalogApiService::getCatalogItems);
  }

  @SuppressWarnings("unused")
  private Flux<CatalogItem> getFirst5ProductsFromCatalog(Exception e) {
    return catalogApiService.getFirst5CatalogItems();
  }

  private static record Product(
      @JsonProperty("id") UUID id
  ) {
  }

}
