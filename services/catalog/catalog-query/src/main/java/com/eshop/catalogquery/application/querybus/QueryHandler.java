package com.eshop.catalogquery.application.querybus;

public interface QueryHandler<R, Q extends Query<R>> {
  R handle(Q query);

  default boolean matches(Q query) {
    final var handlerType = getClass();
    final var queryType = query.getClass();
    return new FirstGenericArgOf(handlerType).isAssignableFrom(queryType);
  }

}
