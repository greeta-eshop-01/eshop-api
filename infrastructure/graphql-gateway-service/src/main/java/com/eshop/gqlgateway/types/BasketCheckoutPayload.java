package com.eshop.gqlgateway.types;

/**
 * Return type for checkout mutation.
 */
public class BasketCheckoutPayload {
  private String orderNumber;

  public BasketCheckoutPayload() {
  }

  public BasketCheckoutPayload(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  @Override
  public String toString() {
    return "BasketCheckoutPayload{" + "orderNumber='" + orderNumber + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasketCheckoutPayload that = (BasketCheckoutPayload) o;
        return java.util.Objects.equals(orderNumber, that.orderNumber);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(orderNumber);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String orderNumber;

    public BasketCheckoutPayload build() {
      BasketCheckoutPayload result = new BasketCheckoutPayload();
          result.orderNumber = this.orderNumber;
          return result;
    }

    public Builder orderNumber(
        String orderNumber) {
      this.orderNumber = orderNumber;
      return this;
    }
  }
}
