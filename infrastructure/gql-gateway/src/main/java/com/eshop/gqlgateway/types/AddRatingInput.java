package com.eshop.gqlgateway.types;

/**
 * Input type for addRating mutation.
 */
public class AddRatingInput {
  private String productId;

  private String value;

  public AddRatingInput() {
  }

  public AddRatingInput(String productId, String value) {
    this.productId = productId;
    this.value = value;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "AddRatingInput{" + "productId='" + productId + "'," +"value='" + value + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddRatingInput that = (AddRatingInput) o;
        return java.util.Objects.equals(productId, that.productId) &&
                            java.util.Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(productId, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String productId;

    private String value;

    public AddRatingInput build() {
                  AddRatingInput result = new AddRatingInput();
                      result.productId = this.productId;
          result.value = this.value;
                      return result;
    }

    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
