package com.eshop.gqlgateway.types;

/**
 * Input type for removeQuantity mutation.
 */
public class BasketRemoveQuantityInput {
  private String basketId;

  private String lineItemId;

  public BasketRemoveQuantityInput() {
  }

  public BasketRemoveQuantityInput(String basketId, String lineItemId) {
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
    return "BasketRemoveQuantityInput{" + "basketId='" + basketId + "'," +"lineItemId='" + lineItemId + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasketRemoveQuantityInput that = (BasketRemoveQuantityInput) o;
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

    public BasketRemoveQuantityInput build() {
                  BasketRemoveQuantityInput result = new BasketRemoveQuantityInput();
                      result.basketId = this.basketId;
          result.lineItemId = this.lineItemId;
                      return result;
    }

    public Builder basketId(String basketId) {
      this.basketId = basketId;
      return this;
    }

    public Builder lineItemId(
        String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
    }
  }
}
