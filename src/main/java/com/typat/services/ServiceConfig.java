package com.typat.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import com.typat.interceptors.HaloApiAuthInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
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
		restTemplate.getMessageConverters().stream().filter(httpMessageConverter ->
				httpMessageConverter instanceof MappingJackson2HttpMessageConverter).forEach(httpMessageConverter -> {
			((MappingJackson2HttpMessageConverter) httpMessageConverter).setObjectMapper(new ObjectMapper());
			((MappingJackson2HttpMessageConverter) httpMessageConverter).setSupportedMediaTypes(ImmutableList.of(
					new MediaType("application", "json", MappingJackson2HttpMessageConverter.DEFAULT_CHARSET),
					new MediaType("text", "plain", MappingJackson2HttpMessageConverter.DEFAULT_CHARSET)));
		});
		return restTemplate;
	}
}
