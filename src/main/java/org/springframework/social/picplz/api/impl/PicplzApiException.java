package org.springframework.social.picplz.api.impl;

import org.springframework.social.SocialException;

@SuppressWarnings("serial")
public class PicplzApiException extends SocialException {

	private int code;
	private String errorType;
	
	public PicplzApiException(int code, String errorType, String message) {
		super(message);
		this.code = code;
		this.errorType = errorType;
	}

	public int getCode() {
		return code;
	}

	public String getErrorType() {
		return errorType;
	}
	
}
