package com.eshop.gqlgateway.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;

/**
 * A shopping basket holds products and can be ordered.
 * Each basket belongs to a registered user.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Basket implements Node {
  /**
   * ID of the basket.
   */
  private String id;

  /**
   * The owner of the basket.
   */
  private User user;

  /**
   * List of line items in the basket.
   */
  private List<LineItem> lineItems;

  /**
   * The sum of the line items quantities.
   */
  private int lineItemsQuantity;

  /**
   * Total price. Sum of all line items prices.
   */
  private double totalPrice;

  public Basket() {
  }

  public Basket(String id, User user, List<LineItem> lineItems, int lineItemsQuantity,
      double totalPrice) {
    this.id = id;
    this.user = user;
    this.lineItems = lineItems;
    this.lineItemsQuantity = lineItemsQuantity;
    this.totalPrice = totalPrice;
  }

  /**
   * ID of the basket.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The owner of the basket.
   */
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  /**
   * List of line items in the basket.
   */
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The sum of the line items quantities.
   */
  public int getLineItemsQuantity() {
    return lineItemsQuantity;
  }

  public void setLineItemsQuantity(int lineItemsQuantity) {
    this.lineItemsQuantity = lineItemsQuantity;
  }

  /**
   * Total price. Sum of all line items prices.
   */
  public double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }

  @Override
  public String toString() {
    return "Basket{" + "id='" + id + "'," +"user='" + user + "'," +"lineItems='" + lineItems + "'," +"lineItemsQuantity='" + lineItemsQuantity + "'," +"totalPrice='" + totalPrice + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket that = (Basket) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(user, that.user) &&
                            java.util.Objects.equals(lineItems, that.lineItems) &&
                            lineItemsQuantity == that.lineItemsQuantity &&
                            totalPrice == that.totalPrice;
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, user, lineItems, lineItemsQuantity, totalPrice);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the basket.
     */
    private String id;

    /**
     * The owner of the basket.
     */
    private User user;

    /**
     * List of line items in the basket.
     */
    private List<LineItem> lineItems;

    /**
     * The sum of the line items quantities.
     */
    private int lineItemsQuantity;

    /**
     * Total price. Sum of all line items prices.
     */
    private double totalPrice;

    public Basket build() {
                  Basket result = new Basket();
                      result.id = this.id;
          result.user = this.user;
          result.lineItems = this.lineItems;
          result.lineItemsQuantity = this.lineItemsQuantity;
          result.totalPrice = this.totalPrice;
                      return result;
    }

    /**
     * ID of the basket.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The owner of the basket.
     */
    public Builder user(User user) {
      this.user = user;
      return this;
    }

    /**
     * List of line items in the basket.
     */
    public Builder lineItems(List<LineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * The sum of the line items quantities.
     */
    public Builder lineItemsQuantity(int lineItemsQuantity) {
      this.lineItemsQuantity = lineItemsQuantity;
      return this;
    }

    /**
     * Total price. Sum of all line items prices.
     */
    public Builder totalPrice(double totalPrice) {
      this.totalPrice = totalPrice;
      return this;
    }
  }
}
