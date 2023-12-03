package com.eshop.gqlgateway.types;

import java.time.LocalDate;

public class CardDetailsInput {
  private String number;

  private String cardHolderName;

  private LocalDate expiration;

  private String securityNumber;

  private String type;

  public CardDetailsInput() {
  }

  public CardDetailsInput(String number, String cardHolderName, LocalDate expiration,
      String securityNumber, String type) {
    this.number = number;
    this.cardHolderName = cardHolderName;
    this.expiration = expiration;
    this.securityNumber = securityNumber;
    this.type = type;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getCardHolderName() {
    return cardHolderName;
  }

  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }

  public LocalDate getExpiration() {
    return expiration;
  }

  public void setExpiration(LocalDate expiration) {
    this.expiration = expiration;
  }

  public String getSecurityNumber() {
    return securityNumber;
  }

  public void setSecurityNumber(String securityNumber) {
    this.securityNumber = securityNumber;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "CardDetailsInput{" + "number='" + number + "'," +"cardHolderName='" + cardHolderName + "'," +"expiration='" + expiration + "'," +"securityNumber='" + securityNumber + "'," +"type='" + type + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardDetailsInput that = (CardDetailsInput) o;
        return java.util.Objects.equals(number, that.number) &&
                            java.util.Objects.equals(cardHolderName, that.cardHolderName) &&
                            java.util.Objects.equals(expiration, that.expiration) &&
                            java.util.Objects.equals(securityNumber, that.securityNumber) &&
                            java.util.Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(number, cardHolderName, expiration, securityNumber, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String number;

    private String cardHolderName;

    private LocalDate expiration;

    private String securityNumber;

    private String type;

    public CardDetailsInput build() {
                  CardDetailsInput result = new CardDetailsInput();
                      result.number = this.number;
          result.cardHolderName = this.cardHolderName;
          result.expiration = this.expiration;
          result.securityNumber = this.securityNumber;
          result.type = this.type;
                      return result;
    }

    public Builder number(String number) {
      this.number = number;
      return this;
    }

    public Builder cardHolderName(
        String cardHolderName) {
      this.cardHolderName = cardHolderName;
      return this;
    }

    public Builder expiration(LocalDate expiration) {
      this.expiration = expiration;
      return this;
    }

    public Builder securityNumber(
        String securityNumber) {
      this.securityNumber = securityNumber;
      return this;
    }

    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }
}
