package com.myshopping.My.Shopping;

import com.myshopping.My.Shopping.models.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		System.out.println(laptop);

		SpringApplication.run(Application.class, args);
	}

}
