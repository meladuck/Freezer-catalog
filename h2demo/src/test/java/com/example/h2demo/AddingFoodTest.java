package com.example.h2demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.h2demo.repository.FoodRepository;
import com.example.h2demo.service.FoodService;

@SpringBootTest
public class AddingFoodTest {
    
    @Autowired
	FoodService fs;

	@Autowired
	FoodRepository fp;

    @Test
	void addsFood(){
		fs.addFood("milk", 20, "drink");
		assertEquals(2, fp.count());
	}

}
