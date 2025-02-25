package org.commons.feature.food.shared;

import java.util.List;

public record FoodView(
    String name,
    CalorieView calories,
    ServingView mainServing,
    FoodInfoView foodDetails,
    List<ServingView> otherServing,
    List<NutritionView> nutrients
) {

}
