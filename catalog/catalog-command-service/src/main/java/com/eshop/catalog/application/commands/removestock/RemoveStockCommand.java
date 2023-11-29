package com.eshop.catalog.application.commands.removestock;

import com.eshop.catalog.application.commandbus.Command;
import com.eshop.catalog.application.models.CatalogItemResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record RemoveStockCommand(
    @JsonProperty
    @NotNull
    UUID productId,
    @JsonProperty
    @NotNull @Min(1)
    Integer quantity
) implements Command<CatalogItemResponse> {
}
