package com.eshop.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.server.resource.web.reactive.function.client.ServerBearerExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AnalyticsWebClientConfig {

  @Bean
  public WebClient.Builder analyticsWebClient() {
    return WebClient.builder()
      .filter(new ServerBearerExchangeFilterFunction());
  }

}
