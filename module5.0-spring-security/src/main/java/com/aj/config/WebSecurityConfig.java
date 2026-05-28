package com.aj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	public WebSecurityConfig() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity)  {
		
		httpSecurity
		.formLogin(Customizer.withDefaults());
		
		return httpSecurity.build();
	}
	

}
