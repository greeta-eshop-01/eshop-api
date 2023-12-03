package com.eshop.gateway.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.server.resource.authentication.ReactiveJwtAuthenticationConverterAdapter;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.csrf.CookieServerCsrfTokenRepository;
import org.springframework.security.web.server.csrf.CsrfToken;
import org.springframework.web.server.WebFilter;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Configuration
@EnableWebFluxSecurity
public class WebSecurityConfig {

    private final JwtAuthConverter jwtAuthConverter;

    @Bean
    public SecurityWebFilterChain securityFilterChain(ServerHttpSecurity http) {
        return http
                .authorizeExchange(exchange -> exchange
                        .pathMatchers(HttpMethod.GET, "/actuator/**").permitAll()
                        .pathMatchers(HttpMethod.GET,"/webjars/**").permitAll()
                        .pathMatchers(HttpMethod.GET,"/", "/swagger-ui.html", "/swagger-ui/**").permitAll()
                        .pathMatchers(HttpMethod.GET,"/swagger-resources/**").permitAll()
                        .pathMatchers(HttpMethod.GET,"/v3/api-docs/**").permitAll()
                        .pathMatchers(HttpMethod.GET,"/favicon.ico").permitAll()

                        .pathMatchers(HttpMethod.GET,"/analytics/v3/api-docs/**").permitAll()
                        .pathMatchers("/analytics/api", "/analytics/api/**").permitAll()

                        .pathMatchers(HttpMethod.GET,"/basket/v3/api-docs/**").permitAll()
                        .pathMatchers("/basket/api", "/basket/api/**").permitAll()

                        .pathMatchers(HttpMethod.GET,"/catalog-command/v3/api-docs/**").permitAll()
                        .pathMatchers("/catalog-command/api", "/catalog-command/api/**").permitAll()

                        .pathMatchers(HttpMethod.GET,"/catalog-query/v3/api-docs/**").permitAll()
                        .pathMatchers("/catalog-query/api", "/catalog-query/api/**").permitAll()

                        .pathMatchers(HttpMethod.GET,"/flux-gateway/v3/api-docs/**").permitAll()
                        .pathMatchers("/flux-gateway/api/v1/basket", "/flux-gateway/api/v1/basket/**").permitAll()
                        .pathMatchers("/flux-gateway/api/v1/catalog", "/flux-gateway/api/v1/catalog/**").permitAll()
                        .pathMatchers("/flux-gateway/api/v1/orders", "/flux-gateway/api/v1/orders/**").permitAll()
                        .pathMatchers("/flux-gateway/api/v1/rating", "/flux-gateway/api/v1/rating/**").permitAll()


                        .pathMatchers(HttpMethod.GET,"/graphql-gateway/v3/api-docs/**").permitAll()
                        .pathMatchers("/graphql-gateway/graphql", "/graphql-gateway/graphql/**").permitAll()
                        .pathMatchers("/graphql-gateway/graphiql", "/graphql-gateway/graphiql/**").permitAll()

                        .pathMatchers(HttpMethod.GET,"/image-gateway/v3/api-docs/**").permitAll()
                        .pathMatchers("/image-gateway", "/image-gateway/**").permitAll()

                        .pathMatchers(HttpMethod.GET,"/order-notifications/v3/api-docs/**").permitAll()
                        .pathMatchers("/order-notifications/endpoint", "/order-notifications/endpoint/**").permitAll()

                        .pathMatchers(HttpMethod.GET,"/order-processing/v3/api-docs/**").permitAll()
                        .pathMatchers("/order-processing/api", "/order-processing/api/**").permitAll()

                        .pathMatchers(HttpMethod.GET,"/rating/v3/api-docs/**").permitAll()
                        .pathMatchers("/rating/api", "/rating/api/**").permitAll()

                        .anyExchange().authenticated()
                        .and()
                        //.exceptionHandling(exceptionHandling -> exceptionHandling
                        //        .authenticationEntryPoint(new HttpStatusServerEntryPoint(HttpStatus.UNAUTHORIZED)))
                        .csrf(csrf -> csrf.csrfTokenRepository(CookieServerCsrfTokenRepository.withHttpOnlyFalse()))
                        .oauth2ResourceServer().jwt()
                        .jwtAuthenticationConverter(new ReactiveJwtAuthenticationConverterAdapter(jwtAuthConverter))
                )
                .build();
    }

    @Bean
    WebFilter csrfWebFilter() {
        // Required because of https://github.com/spring-projects/spring-security/issues/5766
        return (exchange, chain) -> {
            exchange.getResponse().beforeCommit(() -> Mono.defer(() -> {
                Mono<CsrfToken> csrfToken = exchange.getAttribute(CsrfToken.class.getName());
                return csrfToken != null ? csrfToken.then() : Mono.empty();
            }));
            return chain.filter(exchange);
        };
    }

    public static final String ESHOP_MANAGER = "ESHOP_MANAGER";
    public static final String ESHOP_USER = "ESHOP_USER";
}
