package com.example.creativeIdeas;

import OrdersAPI.Models.Shared.Order;
import OrdersAPI.Models.Shared.OrdersRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "OrdersAPI"})
@EnableJpaRepositories(basePackageClasses = {OrdersRepository.class})
@EntityScan(basePackageClasses = {Order.class})
public class CreativeIdeasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreativeIdeasApplication.class, args);
	}

}
