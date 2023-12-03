package com.eshop.gqlgateway.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * An order is a customer's request to purchase products from the shop.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Order implements Node {
  /**
   * ID of the order.
   */
  private String id;

  /**
   * Unique identifier for the order.
   */
  private String orderNumber;

  /**
   * Date and time when the order was created.
   */
  private OffsetDateTime date;

  /**
   * The total price of the order.
   */
  private double totalPrice;

  /**
   * The status of the order.
   */
  private OrderStatus status;

  /**
   * Whether inventory has been reserved for the order.
   */
  private boolean confirmed;

  /**
   * Whether the order has been paid in full.
   */
  private boolean paid;

  /**
   * The user that placed the order.
   */
  private User user;

  /**
   * List of line items in the order.
   */
  private List<LineItem> lineItems;

  /**
   * The sum of the line items quantities.
   */
  private int lineItemsQuantity;

  public Order() {
  }

  public Order(String id, String orderNumber, OffsetDateTime date, double totalPrice,
      OrderStatus status, boolean confirmed, boolean paid, User user, List<LineItem> lineItems,
      int lineItemsQuantity) {
    this.id = id;
    this.orderNumber = orderNumber;
    this.date = date;
    this.totalPrice = totalPrice;
    this.status = status;
    this.confirmed = confirmed;
    this.paid = paid;
    this.user = user;
    this.lineItems = lineItems;
    this.lineItemsQuantity = lineItemsQuantity;
  }

  /**
   * ID of the order.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Unique identifier for the order.
   */
  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  /**
   * Date and time when the order was created.
   */
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  /**
   * The total price of the order.
   */
  public double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }

  /**
   * The status of the order.
   */
  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  /**
   * Whether inventory has been reserved for the order.
   */
  public boolean getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(boolean confirmed) {
    this.confirmed = confirmed;
  }

  /**
   * Whether the order has been paid in full.
   */
  public boolean getPaid() {
    return paid;
  }

  public void setPaid(boolean paid) {
    this.paid = paid;
  }

  /**
   * The user that placed the order.
   */
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  /**
   * List of line items in the order.
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

  @Override
  public String toString() {
    return "Order{" + "id='" + id + "'," +"orderNumber='" + orderNumber + "'," +"date='" + date + "'," +"totalPrice='" + totalPrice + "'," +"status='" + status + "'," +"confirmed='" + confirmed + "'," +"paid='" + paid + "'," +"user='" + user + "'," +"lineItems='" + lineItems + "'," +"lineItemsQuantity='" + lineItemsQuantity + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order that = (Order) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(orderNumber, that.orderNumber) &&
                            java.util.Objects.equals(date, that.date) &&
                            totalPrice == that.totalPrice &&
                            java.util.Objects.equals(status, that.status) &&
                            confirmed == that.confirmed &&
                            paid == that.paid &&
                            java.util.Objects.equals(user, that.user) &&
                            java.util.Objects.equals(lineItems, that.lineItems) &&
                            lineItemsQuantity == that.lineItemsQuantity;
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, orderNumber, date, totalPrice, status, confirmed, paid, user, lineItems, lineItemsQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the order.
     */
    private String id;

    /**
     * Unique identifier for the order.
     */
    private String orderNumber;

    /**
     * Date and time when the order was created.
     */
    private OffsetDateTime date;

    /**
     * The total price of the order.
     */
    private double totalPrice;

    /**
     * The status of the order.
     */
    private OrderStatus status;

    /**
     * Whether inventory has been reserved for the order.
     */
    private boolean confirmed;

    /**
     * Whether the order has been paid in full.
     */
    private boolean paid;

    /**
     * The user that placed the order.
     */
    private User user;

    /**
     * List of line items in the order.
     */
    private List<LineItem> lineItems;

    /**
     * The sum of the line items quantities.
     */
    private int lineItemsQuantity;

    public Order build() {
                  Order result = new Order();
                      result.id = this.id;
          result.orderNumber = this.orderNumber;
          result.date = this.date;
          result.totalPrice = this.totalPrice;
          result.status = this.status;
          result.confirmed = this.confirmed;
          result.paid = this.paid;
          result.user = this.user;
          result.lineItems = this.lineItems;
          result.lineItemsQuantity = this.lineItemsQuantity;
                      return result;
    }

    /**
     * ID of the order.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Unique identifier for the order.
     */
    public Builder orderNumber(String orderNumber) {
      this.orderNumber = orderNumber;
      return this;
    }

    /**
     * Date and time when the order was created.
     */
    public Builder date(OffsetDateTime date) {
      this.date = date;
      return this;
    }

    /**
     * The total price of the order.
     */
    public Builder totalPrice(double totalPrice) {
      this.totalPrice = totalPrice;
      return this;
    }

    /**
     * The status of the order.
     */
    public Builder status(OrderStatus status) {
      this.status = status;
      return this;
    }

    /**
     * Whether inventory has been reserved for the order.
     */
    public Builder confirmed(boolean confirmed) {
      this.confirmed = confirmed;
      return this;
    }

    /**
     * Whether the order has been paid in full.
     */
    public Builder paid(boolean paid) {
      this.paid = paid;
      return this;
    }

    /**
     * The user that placed the order.
     */
    public Builder user(User user) {
      this.user = user;
      return this;
    }

    /**
     * List of line items in the order.
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
  }
}
