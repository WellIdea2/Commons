package org.commons.feature.food.nutriox_api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AltMeasures {

  @JsonProperty("serving_weight")
  private Double servingWeight;
  private String measure;
  private Double seq;
  private Double qty;
}
