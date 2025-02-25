package org.commons.feature.shared.dto;

import org.commons.feature.shared.enums.HttpMethod;
import org.commons.feature.shared.enums.UserAccess;

public record EndpointPermission(String path, UserAccess access, HttpMethod method) {

  public EndpointPermission {
    if (path == null || access == null || method == null) {
      throw new RuntimeException("Parameters cannot be null");
    }
  }
}