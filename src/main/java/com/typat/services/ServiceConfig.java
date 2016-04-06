package com.typat.services;

import com.typat.interceptors.HaloApiAuthInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
//		List<HttpMessageConverter<?>> converters = new ArrayList<>();
//		converters.add(new MappingJackson2HttpMessageConverter());
//		restTemplate.setMessageConverters(converters);
		return restTemplate;
	}
}
