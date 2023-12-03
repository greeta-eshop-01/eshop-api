package com.eshop.gqlgateway.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Product's category.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Category implements Node {
  /**
   * ID of the category
   */
  private String id;

  /**
   * The category's name
   */
  private String name;

  public Category() {
  }

  public Category(String id, String name) {
    this.id = id;
    this.name = name;
  }

  /**
   * ID of the category
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The category's name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Category{" + "id='" + id + "'," +"name='" + name + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category that = (Category) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the category
     */
    private String id;

    /**
     * The category's name
     */
    private String name;

    public Category build() {
                  Category result = new Category();
                      result.id = this.id;
          result.name = this.name;
                      return result;
    }

    /**
     * ID of the category
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The category's name
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
