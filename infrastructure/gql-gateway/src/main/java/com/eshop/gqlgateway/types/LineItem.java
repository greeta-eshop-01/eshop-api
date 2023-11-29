package com.eshop.gqlgateway.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Represents a single line item.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class LineItem implements Node {
  /**
   * ID of the line item.
   */
  private String id;

  /**
   * Name of the product.
   */
  private String name;

  /**
   * Product object associated with this line item.
   */
  private Product product;

  /**
   * Unit price.
   */
  private double unitPrice;

  /**
   * Total price. This value is based on the unit price of the product * quantity.
   */
  private double price;

  /**
   * Number of product units ordered.
   */
  private int quantity;

  /**
   * Image name.
   */
  private String image;

  public LineItem() {
  }

  public LineItem(String id, String name, Product product, double unitPrice, double price,
      int quantity, String image) {
    this.id = id;
    this.name = name;
    this.product = product;
    this.unitPrice = unitPrice;
    this.price = price;
    this.quantity = quantity;
    this.image = image;
  }

  /**
   * ID of the line item.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
   * Product object associated with this line item.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * Unit price.
   */
  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  /**
   * Total price. This value is based on the unit price of the product * quantity.
   */
  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * Number of product units ordered.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
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

  @Override
  public String toString() {
    return "LineItem{" + "id='" + id + "'," +"name='" + name + "'," +"product='" + product + "'," +"unitPrice='" + unitPrice + "'," +"price='" + price + "'," +"quantity='" + quantity + "'," +"image='" + image + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineItem that = (LineItem) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(product, that.product) &&
                            unitPrice == that.unitPrice &&
                            price == that.price &&
                            quantity == that.quantity &&
                            java.util.Objects.equals(image, that.image);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, product, unitPrice, price, quantity, image);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the line item.
     */
    private String id;

    /**
     * Name of the product.
     */
    private String name;

    /**
     * Product object associated with this line item.
     */
    private Product product;

    /**
     * Unit price.
     */
    private double unitPrice;

    /**
     * Total price. This value is based on the unit price of the product * quantity.
     */
    private double price;

    /**
     * Number of product units ordered.
     */
    private int quantity;

    /**
     * Image name.
     */
    private String image;

    public LineItem build() {
                  LineItem result = new LineItem();
                      result.id = this.id;
          result.name = this.name;
          result.product = this.product;
          result.unitPrice = this.unitPrice;
          result.price = this.price;
          result.quantity = this.quantity;
          result.image = this.image;
                      return result;
    }

    /**
     * ID of the line item.
     */
    public Builder id(String id) {
      this.id = id;
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
     * Product object associated with this line item.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * Unit price.
     */
    public Builder unitPrice(double unitPrice) {
      this.unitPrice = unitPrice;
      return this;
    }

    /**
     * Total price. This value is based on the unit price of the product * quantity.
     */
    public Builder price(double price) {
      this.price = price;
      return this;
    }

    /**
     * Number of product units ordered.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * Image name.
     */
    public Builder image(String image) {
      this.image = image;
      return this;
    }
  }
}
