package org.commons.exceptions;

import org.commons.exceptions.throwable.BadRequestException;
import org.commons.exceptions.throwable.ForbiddenException;
import org.commons.exceptions.throwable.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

  @ExceptionHandler(NotFoundException.class)
  public ResponseEntity<ProblemDetail> handleNotFoundException(NotFoundException e) {
    ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND,
        e.getMessage());

    problemDetail.setTitle(e.getTitle());

    return new ResponseEntity<>(problemDetail, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(BadRequestException.class)
  public ResponseEntity<ProblemDetail> handleBadRequestException(BadRequestException e) {
    ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST,
        e.getMessage());

    problemDetail.setTitle(e.getTitle());

    return new ResponseEntity<>(problemDetail, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(ForbiddenException.class)
  public ResponseEntity<ProblemDetail> handleForbiddenException(ForbiddenException e) {
    ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.FORBIDDEN,
        e.getMessage());

    problemDetail.setTitle(e.getTitle());

    return new ResponseEntity<>(problemDetail, HttpStatus.FORBIDDEN);
  }
}
