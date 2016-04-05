package com.typat.interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author typat
 * @since 4/5/16
 */
@Component
public class HaloApiAuthInterceptor implements ClientHttpRequestInterceptor {
	private static String API_KEY;

	@Autowired
	ResourceLoader resourceLoader;

	@PostConstruct
	private void setApiKey() throws IOException {
		Resource resource = resourceLoader.getResource("classpath:halo-api-auth-key.txt");
		Scanner scanner = new Scanner(resource.getFile());
		API_KEY = scanner.next();
	}

	@Override
	public ClientHttpResponse intercept(HttpRequest httpRequest, byte[] bytes, ClientHttpRequestExecution clientHttpRequestExecution) throws IOException {
		HttpHeaders headers = httpRequest.getHeaders();
		headers.add("Ocp-Apim-Subscription-Key", API_KEY);
		return clientHttpRequestExecution.execute(httpRequest, bytes);
	}
}
