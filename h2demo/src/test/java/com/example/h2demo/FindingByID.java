package com.example.h2demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.h2demo.service.FoodService;

@SpringBootTest
public class FindingByID {

    @Autowired
	FoodService fs;

    @Test
	void findsFoodByID(){
		assertEquals("pear", fs.searchById(10001).getName());
	}
}
