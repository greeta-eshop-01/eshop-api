package com.eshop.gqlgateway.types;

/**
 * Input type for addQuantity mutation.
 */
public class BasketAddQuantityInput {
  private String basketId;

  private String lineItemId;

  public BasketAddQuantityInput() {
  }

  public BasketAddQuantityInput(String basketId, String lineItemId) {
    this.basketId = basketId;
    this.lineItemId = lineItemId;
  }

  public String getBasketId() {
    return basketId;
  }

  public void setBasketId(String basketId) {
    this.basketId = basketId;
  }

  public String getLineItemId() {
    return lineItemId;
  }

  public void setLineItemId(String lineItemId) {
    this.lineItemId = lineItemId;
  }

  @Override
  public String toString() {
    return "BasketAddQuantityInput{" + "basketId='" + basketId + "'," +"lineItemId='" + lineItemId + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasketAddQuantityInput that = (BasketAddQuantityInput) o;
        return java.util.Objects.equals(basketId, that.basketId) &&
                            java.util.Objects.equals(lineItemId, that.lineItemId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(basketId, lineItemId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String basketId;

    private String lineItemId;

    public BasketAddQuantityInput build() {
                  BasketAddQuantityInput result = new BasketAddQuantityInput();
                      result.basketId = this.basketId;
          result.lineItemId = this.lineItemId;
                      return result;
    }

    public Builder basketId(String basketId) {
      this.basketId = basketId;
      return this;
    }

    public Builder lineItemId(String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
    }
  }
}