package com.flairstech.workshop.exception; 

import org.springframework.http.HttpStatus;

public class ApiError{
	private HttpStatus httpStatus;
	private String localizedMessage;

	public ApiError(HttpStatus httpStatus, String localizedMessage) {
		this.httpStatus = httpStatus;
		this.localizedMessage = localizedMessage;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getLocalizedMessage() {
		return localizedMessage;
	}

	public void setLocalizedMessage(String localizedMessage) {
		this.localizedMessage = localizedMessage;
	}

}
