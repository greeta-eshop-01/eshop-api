package com.eshop.gqlgateway.types;

import java.util.List;

/**
 * E-Shop signed-in user.
 */
public class Me {
  /**
   * The logged in user
   */
  private User user;

  /**
   * The user's basket.
   */
  private Basket basket;

  /**
   * The user's orders.
   */
  private List<Order> orders;

  public Me() {
  }

  public Me(User user, Basket basket, List<Order> orders) {
    this.user = user;
    this.basket = basket;
    this.orders = orders;
  }

  /**
   * The logged in user
   */
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  /**
   * The user's basket.
   */
  public Basket getBasket() {
    return basket;
  }

  public void setBasket(Basket basket) {
    this.basket = basket;
  }

  /**
   * The user's orders.
   */
  public List<Order> getOrders() {
    return orders;
  }

  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }

  @Override
  public String toString() {
    return "Me{" + "user='" + user + "'," +"basket='" + basket + "'," +"orders='" + orders + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Me that = (Me) o;
        return java.util.Objects.equals(user, that.user) &&
                            java.util.Objects.equals(basket, that.basket) &&
                            java.util.Objects.equals(orders, that.orders);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(user, basket, orders);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The logged in user
     */
    private User user;

    /**
     * The user's basket.
     */
    private Basket basket;

    /**
     * The user's orders.
     */
    private List<Order> orders;

    public Me build() {
                  Me result = new Me();
                      result.user = this.user;
          result.basket = this.basket;
          result.orders = this.orders;
                      return result;
    }

    /**
     * The logged in user
     */
    public Builder user(User user) {
      this.user = user;
      return this;
    }

    /**
     * The user's basket.
     */
    public Builder basket(Basket basket) {
      this.basket = basket;
      return this;
    }

    /**
     * The user's orders.
     */
    public Builder orders(List<Order> orders) {
      this.orders = orders;
      return this;
    }
  }
}
