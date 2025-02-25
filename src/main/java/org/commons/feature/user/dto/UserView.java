package org.commons.feature.user.dto;

import java.util.UUID;
import org.commons.feature.user.enums.Gender;
import org.commons.feature.user.enums.UserRole;
import org.commons.feature.user.enums.WorkoutState;

public record UserView(

    UUID id,
    String username,
    String email,
    Double kilograms,
    Double height,
    WorkoutState workoutState,
    Gender gender,
    UserRole role,
    Integer age
) {

}
