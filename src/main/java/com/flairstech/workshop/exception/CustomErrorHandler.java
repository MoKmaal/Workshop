package com.flairstech.workshop.exception;

import javax.persistence.EntityNotFoundException;

import org.hibernate.exception.JDBCConnectionException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CustomErrorHandler {
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<ApiError> handleInvalidCode(Exception ex, WebRequest request) {

		return new ResponseEntity<ApiError>(new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, "INVALID_COUNTRY_CODE"),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(JDBCConnectionException.class)
	public ResponseEntity<ApiError> handleDBConnectionException(Exception ex, WebRequest request) {

		return new ResponseEntity<ApiError>(new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL_ERROR"),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
}