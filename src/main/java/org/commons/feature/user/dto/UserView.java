package org.commons.feature.user.dto;

import java.util.UUID;

import org.commons.feature.user_details.enums.UserRole;

public record UserView(

    UUID id,
    String username,
    String email,
    UserRole role
) {

}
