package org.commons.feature.food.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.commons.feature.food.enums.AllowedCalorieUnits;

public class ValidCalorieUnitValidator implements ConstraintValidator<ValidCalorieUnit, String> {

  @Override
  public boolean isValid(String unit, ConstraintValidatorContext context) {
    return unit != null && AllowedCalorieUnits.isValidUnit(unit);
  }
}