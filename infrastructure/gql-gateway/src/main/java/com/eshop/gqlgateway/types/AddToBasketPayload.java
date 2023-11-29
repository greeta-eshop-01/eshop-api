package com.eshop.gqlgateway.types;

/**
 * Return type for addToBasket mutation.
 */
public class AddToBasketPayload {
  private Basket basket;

  public AddToBasketPayload() {
  }

  public AddToBasketPayload(Basket basket) {
    this.basket = basket;
  }

  public Basket getBasket() {
    return basket;
  }

  public void setBasket(Basket basket) {
    this.basket = basket;
  }

  @Override
  public String toString() {
    return "AddToBasketPayload{" + "basket='" + basket + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddToBasketPayload that = (AddToBasketPayload) o;
        return java.util.Objects.equals(basket, that.basket);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(basket);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private Basket basket;

    public AddToBasketPayload build() {
      AddToBasketPayload result = new AddToBasketPayload();
          result.basket = this.basket;
          return result;
    }

    public Builder basket(Basket basket) {
      this.basket = basket;
      return this;
    }
  }
}
