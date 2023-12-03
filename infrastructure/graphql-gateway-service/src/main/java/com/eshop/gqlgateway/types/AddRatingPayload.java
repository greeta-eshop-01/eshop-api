package com.eshop.gqlgateway.types;

/**
 * Return type for addRating mutation.
 */
public class AddRatingPayload {
  private Rating rating;

  public AddRatingPayload() {
  }

  public AddRatingPayload(Rating rating) {
    this.rating = rating;
  }

  public Rating getRating() {
    return rating;
  }

  public void setRating(Rating rating) {
    this.rating = rating;
  }

  @Override
  public String toString() {
    return "AddRatingPayload{" + "rating='" + rating + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddRatingPayload that = (AddRatingPayload) o;
        return java.util.Objects.equals(rating, that.rating);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(rating);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private Rating rating;

    public AddRatingPayload build() {
      AddRatingPayload result = new AddRatingPayload();
          result.rating = this.rating;
          return result;
    }

    public Builder rating(Rating rating) {
      this.rating = rating;
      return this;
    }
  }
}
