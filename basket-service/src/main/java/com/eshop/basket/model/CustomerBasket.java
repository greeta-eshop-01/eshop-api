package com.eshop.basket.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@NoArgsConstructor
public class CustomerBasket implements Serializable {
  private UUID id;

  @NotEmpty(message = "Buyer id is required")
  private String buyerId;

  private BasketStatus status = BasketStatus.New;

  private final List<BasketItem> items = new ArrayList<>();

  public CustomerBasket(String customerId) {
    id = UUID.randomUUID();
    buyerId = customerId;
  }

  public void changeStatusTo(BasketStatus status) {
    this.status = status;
  }
}
