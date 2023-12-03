package com.eshop.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class CatalogWebClientConfig {

  @Bean
  WebClient.Builder catalogWebClient() {
    return WebClient.builder();
  }

}
