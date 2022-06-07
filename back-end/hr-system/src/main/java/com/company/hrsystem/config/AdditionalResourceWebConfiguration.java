package com.company.hrsystem.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class AdditionalResourceWebConfiguration implements WebMvcConfigurer {

	@Value("${upload.employee.img.dir}")
	private String uploadEmployeeImgDir;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/" + uploadEmployeeImgDir + "/**")
				.addResourceLocations("file:" + uploadEmployeeImgDir + "\\");
	}

}
