package com.eshop.catalogquery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class CatalogQueryApplication {
  public static void main(String[] args) {
    SpringApplication.run(CatalogQueryApplication.class, args);
  }
}
