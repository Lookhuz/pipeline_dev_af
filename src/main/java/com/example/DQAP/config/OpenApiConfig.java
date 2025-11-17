package com.example.DQAP.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI apiInfo() {
		return new OpenAPI().info(new io.swagger.v3.oas.models.info.Info().title("API DQAP")
				.description("Documentação dos Endpoints da aplicação DQAP").version("1.0.0")
				.contact(new io.swagger.v3.oas.models.info.Contact().name("Rafael Ferro Machado")
						.email("seu-email@exemplo.com")));
	}
}