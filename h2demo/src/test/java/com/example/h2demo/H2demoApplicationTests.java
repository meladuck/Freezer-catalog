package com.example.h2demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.h2demo.service.FoodService;

@SpringBootTest
class H2demoApplicationTests {

	@Autowired
	FoodService fs;

	@Test
	void contextLoads() {
	}

}
