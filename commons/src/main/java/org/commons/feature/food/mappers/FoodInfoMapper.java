package org.commons.feature.food.mappers;

import java.util.Optional;
import org.commons.feature.food.shared.FoodInfoView;
import org.commons.feature.food.nutriox_api.FoodItem;
import org.commons.feature.food.nutriox_api.Photo;
import org.commons.feature.food.nutriox_api.Tags;

public class FoodInfoMapper {

  public static FoodInfoView generateFoodInfo(FoodItem foodItem) {
    return Optional.ofNullable(foodItem.getBrandName())
        .map(brandName ->
            new FoodInfoView(brandName,
                foodItem.getNfIngredientStatement(),
                getPicture(foodItem))
        )
        .orElse(
            new FoodInfoView(Optional.ofNullable(foodItem.getTags())
                .map(Tags::getItem)
                .orElse(null),
                foodItem.getNfIngredientStatement(),
                getPicture(foodItem)));
  }

  private static String getPicture(FoodItem foodItem) {
    return Optional.ofNullable(foodItem.getPhoto())
        .map(Photo::getThumb)
        .orElse(null);
  }
}
