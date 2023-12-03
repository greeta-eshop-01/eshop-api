package com.eshop.gateway.controllers;

import com.eshop.gateway.helper.JwtHelper;
import com.eshop.gateway.models.CatalogItem;
import com.eshop.gateway.security.JwtAuthConverterProperties;
import com.eshop.gateway.services.BestSellingProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/catalog")
public class CatalogController {
  private final BestSellingProductsService bestSellingProductsService;

  private final JwtAuthConverterProperties jwtAuthConverterProperties;

  @GetMapping("topfive")
  public Flux<CatalogItem> getTopFiveCatalogItems(@AuthenticationPrincipal Jwt jwt) {
    return bestSellingProductsService.topFive(JwtHelper.getUsername(jwt, jwtAuthConverterProperties));
  }
}
