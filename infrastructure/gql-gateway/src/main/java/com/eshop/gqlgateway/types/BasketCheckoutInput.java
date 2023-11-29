package com.eshop.gqlgateway.types;

/**
 * Input type for checkout mutation.
 */
public class BasketCheckoutInput {
  private ShippingAddressInput address;

  private CardDetailsInput cardDetails;

  public BasketCheckoutInput() {
  }

  public BasketCheckoutInput(ShippingAddressInput address, CardDetailsInput cardDetails) {
    this.address = address;
    this.cardDetails = cardDetails;
  }

  public ShippingAddressInput getAddress() {
    return address;
  }

  public void setAddress(ShippingAddressInput address) {
    this.address = address;
  }

  public CardDetailsInput getCardDetails() {
    return cardDetails;
  }

  public void setCardDetails(CardDetailsInput cardDetails) {
    this.cardDetails = cardDetails;
  }

  @Override
  public String toString() {
    return "BasketCheckoutInput{" + "address='" + address + "'," +"cardDetails='" + cardDetails + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasketCheckoutInput that = (BasketCheckoutInput) o;
        return java.util.Objects.equals(address, that.address) &&
                            java.util.Objects.equals(cardDetails, that.cardDetails);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(address, cardDetails);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private ShippingAddressInput address;

    private CardDetailsInput cardDetails;

    public BasketCheckoutInput build() {
                  BasketCheckoutInput result = new BasketCheckoutInput();
                      result.address = this.address;
          result.cardDetails = this.cardDetails;
                      return result;
    }

    public Builder address(
        ShippingAddressInput address) {
      this.address = address;
      return this;
    }

    public Builder cardDetails(
        CardDetailsInput cardDetails) {
      this.cardDetails = cardDetails;
      return this;
    }
  }
}
