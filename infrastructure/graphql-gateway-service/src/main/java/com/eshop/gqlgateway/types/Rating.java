package com.eshop.gqlgateway.types;

/**
 * Product's rating.
 */
public class Rating {
  private String value;

  public Rating() {
  }

  public Rating(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Rating{" + "value='" + value + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rating that = (Rating) o;
        return java.util.Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String value;

    public Rating build() {
      Rating result = new Rating();
          result.value = this.value;
          return result;
    }

    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
