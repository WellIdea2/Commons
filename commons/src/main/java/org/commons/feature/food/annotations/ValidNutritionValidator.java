package org.commons.feature.food.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.commons.feature.food.enums.AllowedNutrients;
import org.commons.feature.food.shared.NutritionRequest;

public class ValidNutritionValidator implements
    ConstraintValidator<ValidNutrition, NutritionRequest> {

  @Override
  public boolean isValid(NutritionRequest nutrition, ConstraintValidatorContext context) {
    return nutrition != null &&
        AllowedNutrients.isValidNutrition(nutrition.name(), nutrition.unit());
  }
}