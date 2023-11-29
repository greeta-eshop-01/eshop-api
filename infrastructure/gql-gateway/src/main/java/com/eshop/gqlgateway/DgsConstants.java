package com.eshop.gqlgateway;

public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static class USER {
    public static final String TYPE_NAME = "User";

    public static final String Email = "email";

    public static final String UserName = "userName";
  }

  public static class ME {
    public static final String TYPE_NAME = "Me";

    public static final String User = "user";

    public static final String Basket = "basket";

    public static final String Orders = "orders";

    public static class ORDERS_INPUT_ARGUMENT {
      public static final String Reverse = "reverse";

      public static final String Sort = "sort";
    }
  }

  public static class CATEGORY {
    public static final String TYPE_NAME = "Category";

    public static final String Id = "id";

    public static final String Name = "name";
  }

  public static class BRAND {
    public static final String TYPE_NAME = "Brand";

    public static final String Id = "id";

    public static final String Name = "name";
  }

  public static class RATING {
    public static final String TYPE_NAME = "Rating";

    public static final String Value = "value";
  }

  public static class PRODUCT {
    public static final String TYPE_NAME = "Product";

    public static final String Id = "id";

    public static final String Price = "price";

    public static final String Image = "image";

    public static final String Name = "name";

    public static final String Description = "description";

    public static final String AvailableQuantity = "availableQuantity";

    public static final String Category = "category";

    public static final String Brand = "brand";

    public static final String Rating = "rating";
  }

  public static class LINEITEM {
    public static final String TYPE_NAME = "LineItem";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Product = "product";

    public static final String UnitPrice = "unitPrice";

    public static final String Price = "price";

    public static final String Quantity = "quantity";

    public static final String Image = "image";
  }

  public static class BASKET {
    public static final String TYPE_NAME = "Basket";

    public static final String Id = "id";

    public static final String User = "user";

    public static final String LineItems = "lineItems";

    public static final String LineItemsQuantity = "lineItemsQuantity";

    public static final String TotalPrice = "totalPrice";

    public static class LINEITEMS_INPUT_ARGUMENT {
      public static final String Sort = "sort";
    }
  }

  public static class ORDER {
    public static final String TYPE_NAME = "Order";

    public static final String Id = "id";

    public static final String OrderNumber = "orderNumber";

    public static final String Date = "date";

    public static final String TotalPrice = "totalPrice";

    public static final String Status = "status";

    public static final String Confirmed = "confirmed";

    public static final String Paid = "paid";

    public static final String User = "user";

    public static final String LineItems = "lineItems";

    public static final String LineItemsQuantity = "lineItemsQuantity";

    public static class LINEITEMS_INPUT_ARGUMENT {
      public static final String Sort = "sort";
    }
  }

  public static class PRODUCTSQUERYRESULT {
    public static final String TYPE_NAME = "ProductsQueryResult";

    public static final String Total = "total";

    public static final String PageSize = "pageSize";

    public static final String Page = "page";

    public static final String Result = "result";
  }

  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String Me = "me";

    public static final String Node = "node";

    public static final String Basket = "basket";

    public static final String Order = "order";

    public static final String Orders = "orders";

    public static final String Product = "product";

    public static final String Products = "products";

    public static final String LineItem = "lineItem";

    public static final String Brand = "brand";

    public static final String Brands = "brands";

    public static final String Category = "category";

    public static final String Categories = "categories";

    public static class NODE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class BASKET_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class ORDER_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class ORDERS_INPUT_ARGUMENT {
      public static final String Reverse = "reverse";

      public static final String Sort = "sort";
    }

    public static class PRODUCT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class PRODUCTS_INPUT_ARGUMENT {
      public static final String Query = "query";

      public static final String Sort = "sort";

      public static final String Filter = "filter";

      public static final String Reverse = "reverse";

      public static final String Page = "page";

      public static final String PageSize = "pageSize";
    }

    public static class LINEITEM_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class BRAND_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class CATEGORY_INPUT_ARGUMENT {
      public static final String Id = "id";
    }
  }

  public static class ADDTOBASKETPAYLOAD {
    public static final String TYPE_NAME = "AddToBasketPayload";

    public static final String Basket = "basket";
  }

  public static class BASKETADDQUANTITYPAYLOAD {
    public static final String TYPE_NAME = "BasketAddQuantityPayload";

    public static final String Basket = "basket";
  }

  public static class BASKETREMOVEQUANTITYPAYLOAD {
    public static final String TYPE_NAME = "BasketRemoveQuantityPayload";

    public static final String Basket = "basket";
  }

  public static class BASKETCHECKOUTPAYLOAD {
    public static final String TYPE_NAME = "BasketCheckoutPayload";

    public static final String OrderNumber = "orderNumber";
  }

  public static class ADDRATINGPAYLOAD {
    public static final String TYPE_NAME = "AddRatingPayload";

    public static final String Rating = "rating";
  }

  public static class MUTATION {
    public static final String TYPE_NAME = "Mutation";

    public static final String AddToBasket = "addToBasket";

    public static final String AddQuantity = "addQuantity";

    public static final String RemoveQuantity = "removeQuantity";

    public static final String Checkout = "checkout";

    public static final String AddRating = "addRating";

    public static class ADDTOBASKET_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class ADDQUANTITY_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class REMOVEQUANTITY_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class CHECKOUT_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class ADDRATING_INPUT_ARGUMENT {
      public static final String Input = "input";
    }
  }

  public static class PRODUCTFILTER {
    public static final String TYPE_NAME = "ProductFilter";

    public static final String BrandId = "brandId";

    public static final String CatalogId = "catalogId";
  }

  public static class ADDTOBASKETINPUT {
    public static final String TYPE_NAME = "AddToBasketInput";

    public static final String BasketId = "basketId";

    public static final String LineItemId = "lineItemId";
  }

  public static class BASKETADDQUANTITYINPUT {
    public static final String TYPE_NAME = "BasketAddQuantityInput";

    public static final String BasketId = "basketId";

    public static final String LineItemId = "lineItemId";
  }

  public static class BASKETREMOVEQUANTITYINPUT {
    public static final String TYPE_NAME = "BasketRemoveQuantityInput";

    public static final String BasketId = "basketId";

    public static final String LineItemId = "lineItemId";
  }

  public static class SHIPPINGADDRESSINPUT {
    public static final String TYPE_NAME = "ShippingAddressInput";

    public static final String City = "city";

    public static final String Street = "street";

    public static final String State = "state";

    public static final String Country = "country";

    public static final String ZipCode = "zipCode";
  }

  public static class CARDDETAILSINPUT {
    public static final String TYPE_NAME = "CardDetailsInput";

    public static final String Number = "number";

    public static final String CardHolderName = "cardHolderName";

    public static final String Expiration = "expiration";

    public static final String SecurityNumber = "securityNumber";

    public static final String Type = "type";
  }

  public static class BASKETCHECKOUTINPUT {
    public static final String TYPE_NAME = "BasketCheckoutInput";

    public static final String Address = "address";

    public static final String CardDetails = "cardDetails";
  }

  public static class ADDRATINGINPUT {
    public static final String TYPE_NAME = "AddRatingInput";

    public static final String ProductId = "productId";

    public static final String Value = "value";
  }

  public static class NODE {
    public static final String TYPE_NAME = "Node";

    public static final String Id = "id";
  }
}
