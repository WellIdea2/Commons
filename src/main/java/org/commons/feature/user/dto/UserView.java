package org.commons.feature.user.dto;

import java.util.UUID;

import org.commons.feature.user.enums.UserRole;

public record UserView(

    UUID id,
    String username,
    String email,
    UserRole role
) {

}
