package org.commons.feature.shared.util;

import org.commons.feature.user.dto.UserView;

public class UserExtractor {

  private final static GsonWrapper GSON_WRAPPER = new GsonWrapper();

  public static UserView get(String token) {
    try {
      return GSON_WRAPPER.fromJson(token, UserView.class);
    } catch (Exception e) {
      throw new RuntimeException("Invalid token");
    }
  }

}
