package com.typat.services;

import com.typat.interceptors.HaloApiAuthInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Collections;

/**
 * @author typat
 * @since 4/5/16
 */
@Configuration
public class ServiceConfig {
	public static final String HOST = "https://www.haloapi.com";

	@Bean
	public RestTemplate restTemplate() throws IOException {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setInterceptors(Collections.singletonList(new HaloApiAuthInterceptor()));
		return restTemplate;
	}
}
