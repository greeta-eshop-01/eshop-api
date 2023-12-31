package com.eshop.gqlgateway.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BasketRestTemplateConfig {

  @Bean
  public RestTemplate basketRestTemplate() {
    return new RestTemplateBuilder()
      .additionalInterceptors(new BearerExchangeInterceptor())
      .build();
  }

}
