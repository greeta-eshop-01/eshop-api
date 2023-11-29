package com.eshop.catalog.application.commands.changeproductname;

import com.eshop.catalog.application.commandbus.Command;
import com.eshop.catalog.application.models.CatalogItemResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record ChangeProductNameCommand(
    @JsonProperty
    @NotNull
    UUID productId,
    @JsonProperty
    @NotEmpty String name
) implements Command<CatalogItemResponse> {
}
