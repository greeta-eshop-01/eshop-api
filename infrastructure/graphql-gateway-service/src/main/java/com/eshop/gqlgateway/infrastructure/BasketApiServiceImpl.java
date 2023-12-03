package com.eshop.gqlgateway.infrastructure;

import com.eshop.gqlgateway.models.BasketCheckoutDto;
import com.eshop.gqlgateway.models.BasketDto;
import com.eshop.gqlgateway.models.BasketItemDto;
import com.eshop.gqlgateway.services.BasketApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class BasketApiServiceImpl implements BasketApiService {
  private final RestTemplate basketRestTemplate;

  @Override
  public Optional<BasketDto> findByUserId(String userId) {
    return Optional.ofNullable(
      basketRestTemplate.getForObject("http://basket/api/customer/" + userId, BasketDto.class));
  }

  @Override
  public Optional<BasketDto> findById(UUID id) {
    return Optional.ofNullable(
      basketRestTemplate.getForObject("http://basket/api/" + id, BasketDto.class));
  }

  @Override
  public Optional<BasketItemDto> findBasketItemById(UUID id) {
    // TODO impl
    return Optional.empty();
  }

  @Override
  public Optional<BasketDto> update(BasketDto basket) {
    final var response = basketRestTemplate.postForEntity("http://basket/api/", basket, BasketDto.class);
    return Optional.ofNullable(response.getBody());
  }

  @Override
  public void checkout(BasketCheckoutDto basketCheckout) {
    HttpHeaders headers = new HttpHeaders();
    headers.set("x-requestid", UUID.randomUUID().toString());
    HttpEntity<BasketCheckoutDto> request = new HttpEntity<>(basketCheckout, headers);

    basketRestTemplate.postForEntity("http://basket/api/checkout", request, Void.class);
  }
}
