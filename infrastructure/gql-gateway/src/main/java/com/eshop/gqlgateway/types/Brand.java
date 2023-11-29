package com.eshop.gqlgateway.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Product's brand.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Brand implements Node {
  /**
   * ID of the brand
   */
  private String id;

  /**
   * The brand's name
   */
  private String name;

  public Brand() {
  }

  public Brand(String id, String name) {
    this.id = id;
    this.name = name;
  }

  /**
   * ID of the brand
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The brand's name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Brand{" + "id='" + id + "'," +"name='" + name + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand that = (Brand) o;
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
     * ID of the brand
     */
    private String id;

    /**
     * The brand's name
     */
    private String name;

    public Brand build() {
                  Brand result = new Brand();
                      result.id = this.id;
          result.name = this.name;
                      return result;
    }

    /**
     * ID of the brand
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The brand's name
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
