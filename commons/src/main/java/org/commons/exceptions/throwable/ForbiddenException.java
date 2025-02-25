package org.commons.exceptions.throwable;

import org.commons.exceptions.ExceptionMessage;

public class ForbiddenException extends BaseException {

  public ForbiddenException(ExceptionMessage exceptionMessage) {
    super(exceptionMessage);
  }
}