package com.googlecode.jmxtrans.model.output.elastic;

public class ElasticWriterException extends Exception {
	public ElasticWriterException(String message, Throwable cause) {
		super(message, cause);
	}

	public ElasticWriterException(String message) {
		super(message);
	}
}
