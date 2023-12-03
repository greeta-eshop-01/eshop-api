package com.eshop.gqlgateway.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * An object with a Globally Unique ID.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Category.class, name = "Category"),
    @JsonSubTypes.Type(value = Brand.class, name = "Brand"),
    @JsonSubTypes.Type(value = Product.class, name = "Product"),
    @JsonSubTypes.Type(value = LineItem.class, name = "LineItem"),
    @JsonSubTypes.Type(value = Basket.class, name = "Basket"),
    @JsonSubTypes.Type(value = Order.class, name = "Order")
})
public interface Node {
  /**
   * ID of the object.
   */
  String getId();

  /**
   * ID of the object.
   */
  void setId(String id);
}
