package com.eshop.gqlgateway.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CatalogRestTemplateConfig {

  @Bean
  RestTemplate catalogRestTemplate() {
    return new RestTemplate();
  }

}
