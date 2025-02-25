package org.commons.exceptions.throwable;

import org.commons.exceptions.ExceptionMessage;

public class NotFoundException extends BaseException {

  public NotFoundException(ExceptionMessage exceptionMessage, Object... values) {
    super(exceptionMessage, values);
  }
}
