package org.springframework.social.picplz.api.impl;

import java.net.URI;
import java.util.Collections;
import java.util.Map;

import org.springframework.social.support.URIBuilder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public abstract class AbstractPicplzOperations {
	
	protected final PicplzTemplate picPlzTemplate;
	
	public AbstractPicplzOperations(PicplzTemplate picPlzTemplate) {
		this.picPlzTemplate = picPlzTemplate;
	}
	
	protected <T> T get(URI uri, Class<T> responseType) {
		return picPlzTemplate.getRestTemplate().getForObject(uri, responseType);
	}
	
	protected <C> C post(URI uri, MultiValueMap<String,String> data,  Class<C> responseType) {
	    MultiValueMap<String, String> requestData = new LinkedMultiValueMap<String, String>(data);
		return picPlzTemplate.getRestTemplate().postForObject(uri, requestData, responseType);
	}
	
	protected void delete(URI uri) {
		picPlzTemplate.getRestTemplate().delete(uri);
	}
	
	protected URI buildUri(String path) {
		return buildUri(path, Collections.<String, String>emptyMap());
	}
	
	protected URI buildUri(String path, Map<String, String> params) {
		URIBuilder uriBuilder = picPlzTemplate.withOauth_token(API_URL_BASE + path);
		for (String paramName : params.keySet()) {
			uriBuilder.queryParam(paramName, String.valueOf(params.get(paramName)));
		}
		URI uri = uriBuilder.build();
		return uri;
	}
	
	protected static final String API_URL_BASE = "https://api.picplz.com/api/v2/";
}
