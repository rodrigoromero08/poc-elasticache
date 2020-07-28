package com.rodrigoromero.poc.elasticache.clients;

import com.rodrigoromero.poc.elasticache.exceptions.NotFoundException;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

	@Override
	public Exception decode(String methodKey, Response response) {
		switch (response.status()) {
		case 404:
			return new NotFoundException();

		default:
			return new Exception("Generic error");
		}
	}

}
