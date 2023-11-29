package com.eshop.gqlgateway.types;

/**
 * Represents the current status of the order.
 */
public enum OrderStatus {
  SUBMITTED,

  PAID,

  CANCELLED,

  SHIPPED,

  AWAITING_VALIDATION,

  STOCK_CONFIRMED
}
