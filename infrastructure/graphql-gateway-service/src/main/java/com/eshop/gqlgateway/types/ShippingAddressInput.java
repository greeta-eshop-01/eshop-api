package com.eshop.gqlgateway.types;

/**
 * Input type for shipping address.
 */
public class ShippingAddressInput {
  private String city;

  private String street;

  private String state;

  private String country;

  private String zipCode;

  public ShippingAddressInput() {
  }

  public ShippingAddressInput(String city, String street, String state, String country,
      String zipCode) {
    this.city = city;
    this.street = street;
    this.state = state;
    this.country = country;
    this.zipCode = zipCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  @Override
  public String toString() {
    return "ShippingAddressInput{" + "city='" + city + "'," +"street='" + street + "'," +"state='" + state + "'," +"country='" + country + "'," +"zipCode='" + zipCode + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShippingAddressInput that = (ShippingAddressInput) o;
        return java.util.Objects.equals(city, that.city) &&
                            java.util.Objects.equals(street, that.street) &&
                            java.util.Objects.equals(state, that.state) &&
                            java.util.Objects.equals(country, that.country) &&
                            java.util.Objects.equals(zipCode, that.zipCode);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(city, street, state, country, zipCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String city;

    private String street;

    private String state;

    private String country;

    private String zipCode;

    public ShippingAddressInput build() {
                  ShippingAddressInput result = new ShippingAddressInput();
                      result.city = this.city;
          result.street = this.street;
          result.state = this.state;
          result.country = this.country;
          result.zipCode = this.zipCode;
                      return result;
    }

    public Builder city(String city) {
      this.city = city;
      return this;
    }

    public Builder street(String street) {
      this.street = street;
      return this;
    }

    public Builder state(String state) {
      this.state = state;
      return this;
    }

    public Builder country(String country) {
      this.country = country;
      return this;
    }

    public Builder zipCode(String zipCode) {
      this.zipCode = zipCode;
      return this;
    }
  }
}
