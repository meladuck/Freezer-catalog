package com.example.h2demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.h2demo.entity.FoodItem;
import com.example.h2demo.service.FoodService;

/**
 * Controller class for the Freezer catalog
 */
@RestController
@ResponseBody
public class FoodController {

	/**
	 * Food service instance
	 */
	@Autowired
	FoodService foodSer;

	/**
	 * Method handling Get requests searching a food using its id
	 * @param id - id of food
	 * @return details of the food
	 */
	@GetMapping("/food")
	private FoodItem findFoodbyID(@RequestParam long id){
		return foodSer.searchById(id);
	}

	/**
	 * Method handling Get requests searching a food using its name
	 * @param name - name of food
	 * @return details of the food
	 */
	@GetMapping("/food/search")
	private FoodItem findFoodByName(@RequestParam String name){
		return foodSer.searchByName(name);
	}

	/**
	 * Method handling Post requests to update existing foods or add new ones
	 * @param newItem - item to be added/updated
	 * @return id of the entry in the database
	 */
	@PostMapping(value="/food", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	private String saveFood(@RequestBody FoodItem newItem){
		if (foodSer.searchByName(newItem.getName())==null){
		return String.valueOf(foodSer.addFood(newItem.getName(), newItem.getQuantity(), newItem.getType()));
		}
		else {
			return "Item Updated. New ID: " + foodSer.updateFood(newItem);
		}
	}
	

}
