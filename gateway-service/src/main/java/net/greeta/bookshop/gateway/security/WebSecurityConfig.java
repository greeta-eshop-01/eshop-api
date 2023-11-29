package net.greeta.bookshop.gateway.security;

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

                        .pathMatchers(HttpMethod.GET,"/author-book/v3/api-docs/**").permitAll()
                        .pathMatchers("/author-book/api/authors", "/author-book/api/authors/**").permitAll()
                        .pathMatchers("/author-book/api/books", "/author-book/api/books/**").permitAll()
                        .pathMatchers("/author-book/graphql", "/author-book/graphql/**").permitAll()
                        .pathMatchers("/author-book/graphiql", "/author-book/graphiql/**").permitAll()

                        .pathMatchers(HttpMethod.GET,"/book-review/v3/api-docs/**").permitAll()
                        .pathMatchers("/book-review/graphql", "/book-review/graphql/**").permitAll()
                        .pathMatchers("/book-review/graphiql", "/book-review/graphiql/**").permitAll()

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

    public static final String BOOK_MANAGER = "BOOK_MANAGER";
    public static final String BOOK_USER = "BOOK_USER";
}
