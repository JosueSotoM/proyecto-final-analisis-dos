package com.souldev.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SecuritySApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuritySApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/auth/login").allowedOrigins("http://localhost:4200");
				registry.addMapping("/auth/register").allowedOrigins("http://localhost:4200");
			}
		};
	}

}
