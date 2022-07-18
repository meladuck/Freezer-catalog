package com.example.h2demo;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.h2demo.service.FoodService;

@SpringBootTest
public class FindingByName {

    @Autowired
	FoodService fs;

    @Test
	void findsFoodByName(){
		assertNull(fs.searchByName("sgsgsg"));
	}
}
