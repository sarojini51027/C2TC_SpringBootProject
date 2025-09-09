package com.tnsif.Scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class SpringIocScopeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(SpringIocScopeApplication.class, args);
		Product p1 = var.getBean(Product.class);
	}
	

}
