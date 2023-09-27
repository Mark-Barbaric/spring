package com.example.springmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.build.RouterLocatorBuilder;
import org.springframework.context.annocation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouterLocatorBuilder builder) {
		return builder.routes()
			.route("service1_route", r -> r
				.path("/service1/**"))
				.uri("http://localhost:8081");
	}
}
