package com.eshop.gqlgateway.types;

/**
 * Filter properties for the product.
 */
public class ProductFilter {
  /**
   * Brand ID.
   */
  private String brandId;

  /**
   * Catalog ID.
   */
  private String catalogId;

  public ProductFilter() {
  }

  public ProductFilter(String brandId, String catalogId) {
    this.brandId = brandId;
    this.catalogId = catalogId;
  }

  /**
   * Brand ID.
   */
  public String getBrandId() {
    return brandId;
  }

  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }

  /**
   * Catalog ID.
   */
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  @Override
  public String toString() {
    return "ProductFilter{" + "brandId='" + brandId + "'," +"catalogId='" + catalogId + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductFilter that = (ProductFilter) o;
        return java.util.Objects.equals(brandId, that.brandId) &&
                            java.util.Objects.equals(catalogId, that.catalogId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(brandId, catalogId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Brand ID.
     */
    private String brandId;

    /**
     * Catalog ID.
     */
    private String catalogId;

    public ProductFilter build() {
                  ProductFilter result = new ProductFilter();
                      result.brandId = this.brandId;
          result.catalogId = this.catalogId;
                      return result;
    }

    /**
     * Brand ID.
     */
    public Builder brandId(String brandId) {
      this.brandId = brandId;
      return this;
    }

    /**
     * Catalog ID.
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }
  }
}
