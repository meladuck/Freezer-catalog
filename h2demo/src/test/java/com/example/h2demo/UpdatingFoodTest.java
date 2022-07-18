package com.example.h2demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.h2demo.entity.FoodItem;
import com.example.h2demo.service.FoodService;

@SpringBootTest
public class UpdatingFoodTest {
    
    @Autowired
	FoodService fs;

    @Test
	void updatesFood(){
		FoodItem newFood = new FoodItem("milk", 3, "drink");
		fs.updateFood(newFood);
		assertEquals(3,fs.searchByName("milk").getQuantity());
	}

}
