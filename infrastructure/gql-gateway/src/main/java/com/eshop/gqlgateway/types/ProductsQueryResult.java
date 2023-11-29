package com.eshop.gqlgateway.types;

import java.util.List;

public class ProductsQueryResult {
  private int total;

  private int pageSize;

  private int page;

  private List<Product> result;

  public ProductsQueryResult() {
  }

  public ProductsQueryResult(int total, int pageSize, int page, List<Product> result) {
    this.total = total;
    this.pageSize = pageSize;
    this.page = page;
    this.result = result;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  public List<Product> getResult() {
    return result;
  }

  public void setResult(List<Product> result) {
    this.result = result;
  }

  @Override
  public String toString() {
    return "ProductsQueryResult{" + "total='" + total + "'," +"pageSize='" + pageSize + "'," +"page='" + page + "'," +"result='" + result + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsQueryResult that = (ProductsQueryResult) o;
        return total == that.total &&
                            pageSize == that.pageSize &&
                            page == that.page &&
                            java.util.Objects.equals(result, that.result);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(total, pageSize, page, result);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private int total;

    private int pageSize;

    private int page;

    private List<Product> result;

    public ProductsQueryResult build() {
                  ProductsQueryResult result = new ProductsQueryResult();
                      result.total = this.total;
          result.pageSize = this.pageSize;
          result.page = this.page;
          result.result = this.result;
                      return result;
    }

    public Builder total(int total) {
      this.total = total;
      return this;
    }

    public Builder pageSize(int pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    public Builder page(int page) {
      this.page = page;
      return this;
    }

    public Builder result(List<Product> result) {
      this.result = result;
      return this;
    }
  }
}
