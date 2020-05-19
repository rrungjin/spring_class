package kr.inhatc.spring.configuration;



import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration

public class WebMvcConfiguration implements WebMvcConfigurer{

	

	@Bean

	public CommonsMultipartResolver multipartResolver() {

//		파일 크기 같은 것을 설정 가능 하다.

		CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();

		commonsMultipartResolver.setDefaultEncoding("UTF-8");

		commonsMultipartResolver.setMaxUploadSizePerFile(10 * 1024 * 1024); // 5MB

		return commonsMultipartResolver;

		

		

	}



}