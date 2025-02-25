package org.commons.exceptions.throwable;

import org.commons.exceptions.ExceptionMessage;

public class BadRequestException extends BaseException {

  public BadRequestException(ExceptionMessage exceptionMessage) {
    super(exceptionMessage);
  }

  public BadRequestException(ExceptionMessage exceptionMessage, Object... values) {
    super(exceptionMessage, values);
  }
}
