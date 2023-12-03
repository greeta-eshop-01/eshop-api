package com.eshop.gqlgateway.types;

/**
 * E-Shop user.
 */
public class User {
  /**
   * The user's email
   */
  private String email;

  /**
   * The user's user name
   */
  private String userName;

  public User() {
  }

  public User(String email, String userName) {
    this.email = email;
    this.userName = userName;
  }

  /**
   * The user's email
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The user's user name
   */
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public String toString() {
    return "User{" + "email='" + email + "'," +"userName='" + userName + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return java.util.Objects.equals(email, that.email) &&
                            java.util.Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(email, userName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The user's email
     */
    private String email;

    /**
     * The user's user name
     */
    private String userName;

    public User build() {
                  User result = new User();
                      result.email = this.email;
          result.userName = this.userName;
                      return result;
    }

    /**
     * The user's email
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * The user's user name
     */
    public Builder userName(String userName) {
      this.userName = userName;
      return this;
    }
  }
}
