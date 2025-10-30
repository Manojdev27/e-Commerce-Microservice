package com.hogwarts.orderservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
		
	    @Bean
	    public OpenAPI customOpenAPI() {
	        
	        Info info = new Info()
	                .title("API for Order Service")
	                .version("1.0.0")
	                .description("API documentation for my Order Service");

	        return new OpenAPI()
	                .info(info);
	    }
	}
