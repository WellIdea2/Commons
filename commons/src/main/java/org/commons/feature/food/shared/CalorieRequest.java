package org.commons.feature.food.shared;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import org.commons.feature.food.annotations.ValidCalorieUnit;

public record CalorieRequest(

    @NotNull(message = "Amount is required")
    @PositiveOrZero(message = "Amount cannot be negative")
    Double amount,

    @NotNull(message = "Unit is required")
    @ValidCalorieUnit
    String unit
) {

}