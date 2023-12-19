package com.eshop.gateway.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.server.resource.authentication.ReactiveJwtAuthenticationConverterAdapter;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.savedrequest.NoOpServerRequestCache;

@RequiredArgsConstructor
@Configuration
@EnableWebFluxSecurity
public class WebSecurityConfig {

  private final JwtAuthConverter jwtAuthConverter;

  @Bean
  SecurityWebFilterChain filterChain(ServerHttpSecurity http) {
    return http
      .authorizeExchange(exchange -> exchange

        .pathMatchers("/swagger-ui.html", "/swagger-ui/**", "/v3/api-docs", "/v3/api-docs/**").permitAll()

        .pathMatchers(HttpMethod.GET, "/api/v1/catalog/**").permitAll()
        .pathMatchers(HttpMethod.GET, "/api/v1/rating/**").permitAll()
        .pathMatchers("/api/v1/rating/**").hasAnyRole(ESHOP_MANAGER, ESHOP_USER)
        .pathMatchers("/api/v1/basket/**").hasAnyRole(ESHOP_MANAGER, ESHOP_USER)
        .pathMatchers("/api/v1/orders/**").hasAnyRole(ESHOP_MANAGER, ESHOP_USER)
        .pathMatchers("/api/v1/catalog/**").hasAnyRole(ESHOP_MANAGER, ESHOP_USER)

        .anyExchange().authenticated())
      .oauth2ResourceServer(oauth2ResourceServer -> oauth2ResourceServer.jwt(
        jwt -> jwt.jwtAuthenticationConverter(new ReactiveJwtAuthenticationConverterAdapter(jwtAuthConverter))))
      .requestCache(requestCacheSpec ->
        requestCacheSpec.requestCache(NoOpServerRequestCache.getInstance()))
      .csrf(ServerHttpSecurity.CsrfSpec::disable)
      .build();
  }

  public static final String ESHOP_MANAGER = "ESHOP_MANAGER";
  public static final String ESHOP_USER = "ESHOP_USER";
}
