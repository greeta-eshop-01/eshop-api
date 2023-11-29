package com.eshop.gqlgateway.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * The product resource represents a product that is available in the shop.
 * The user can add a product in his basket.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Product implements Node {
  /**
   * ID of the product.
   */
  private String id;

  /**
   * Price of the product
   */
  private double price;

  /**
   * Image name.
   */
  private String image;

  /**
   * Name of the product.
   */
  private String name;

  /**
   * Description of the product.
   */
  private String description;

  /**
   * Quantity of available items.
   */
  private int availableQuantity;

  /**
   * Product category
   */
  private Category category;

  /**
   * Product brand
   */
  private Brand brand;

  /**
   * Product rating
   */
  private Rating rating;

  public Product() {
  }

  public Product(String id, double price, String image, String name, String description,
      int availableQuantity, Category category, Brand brand, Rating rating) {
    this.id = id;
    this.price = price;
    this.image = image;
    this.name = name;
    this.description = description;
    this.availableQuantity = availableQuantity;
    this.category = category;
    this.brand = brand;
    this.rating = rating;
  }

  /**
   * ID of the product.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Price of the product
   */
  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * Image name.
   */
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  /**
   * Name of the product.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Description of the product.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Quantity of available items.
   */
  public int getAvailableQuantity() {
    return availableQuantity;
  }

  public void setAvailableQuantity(int availableQuantity) {
    this.availableQuantity = availableQuantity;
  }

  /**
   * Product category
   */
  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  /**
   * Product brand
   */
  public Brand getBrand() {
    return brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  /**
   * Product rating
   */
  public Rating getRating() {
    return rating;
  }

  public void setRating(Rating rating) {
    this.rating = rating;
  }

  @Override
  public String toString() {
    return "Product{" + "id='" + id + "'," +"price='" + price + "'," +"image='" + image + "'," +"name='" + name + "'," +"description='" + description + "'," +"availableQuantity='" + availableQuantity + "'," +"category='" + category + "'," +"brand='" + brand + "'," +"rating='" + rating + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product that = (Product) o;
        return java.util.Objects.equals(id, that.id) &&
                            price == that.price &&
                            java.util.Objects.equals(image, that.image) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(description, that.description) &&
                            availableQuantity == that.availableQuantity &&
                            java.util.Objects.equals(category, that.category) &&
                            java.util.Objects.equals(brand, that.brand) &&
                            java.util.Objects.equals(rating, that.rating);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, price, image, name, description, availableQuantity, category, brand, rating);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the product.
     */
    private String id;

    /**
     * Price of the product
     */
    private double price;

    /**
     * Image name.
     */
    private String image;

    /**
     * Name of the product.
     */
    private String name;

    /**
     * Description of the product.
     */
    private String description;

    /**
     * Quantity of available items.
     */
    private int availableQuantity;

    /**
     * Product category
     */
    private Category category;

    /**
     * Product brand
     */
    private Brand brand;

    /**
     * Product rating
     */
    private Rating rating;

    public Product build() {
                  Product result = new Product();
                      result.id = this.id;
          result.price = this.price;
          result.image = this.image;
          result.name = this.name;
          result.description = this.description;
          result.availableQuantity = this.availableQuantity;
          result.category = this.category;
          result.brand = this.brand;
          result.rating = this.rating;
                      return result;
    }

    /**
     * ID of the product.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Price of the product
     */
    public Builder price(double price) {
      this.price = price;
      return this;
    }

    /**
     * Image name.
     */
    public Builder image(String image) {
      this.image = image;
      return this;
    }

    /**
     * Name of the product.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Description of the product.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Quantity of available items.
     */
    public Builder availableQuantity(int availableQuantity) {
      this.availableQuantity = availableQuantity;
      return this;
    }

    /**
     * Product category
     */
    public Builder category(Category category) {
      this.category = category;
      return this;
    }

    /**
     * Product brand
     */
    public Builder brand(Brand brand) {
      this.brand = brand;
      return this;
    }

    /**
     * Product rating
     */
    public Builder rating(Rating rating) {
      this.rating = rating;
      return this;
    }
  }
}
