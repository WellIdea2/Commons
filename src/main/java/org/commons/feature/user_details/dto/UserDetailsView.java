package org.commons.feature.user_details.dto;

import org.commons.feature.user_details.enums.Gender;
import org.commons.feature.user_details.enums.WorkoutState;

import java.util.UUID;

public record UserDetailsView(
    UUID id,
    Double kilograms,
    Double height,
    WorkoutState workoutState,
    Gender gender,
    Integer age,
    UUID userId
) {
}
