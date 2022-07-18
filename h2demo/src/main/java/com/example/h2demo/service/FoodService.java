package com.example.h2demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.h2demo.entity.FoodItem;
import com.example.h2demo.repository.FoodRepository;

/**
 * Service class providing underlining functionality for the food controller class
 */
@Service
public class FoodService {
    
    /**
     * Instance of food repository
     */
    @Autowired
    FoodRepository foodRep;

    /**
     * Search method using entity ID
     * @param id - id of food being searched
     * @return record of food with the given id
     */
    public FoodItem searchById(long id){
        return foodRep.findById(id).get();
    }

    /**
     * Method to add new food to the database
     * @param fname - food name
     * @param fquantity - food quantity
     * @param ftype - food type
     * @return id of entry
     */
    public long addFood(String fname, int fquantity, String ftype){
        FoodItem newFood = new FoodItem(fname, fquantity, ftype);
        foodRep.save(newFood);
        return newFood.getID();
    }

    /**
     * Method to update existing food
     * @param item - updated entity
     * @return new id of updated food
     */
    public String updateFood(FoodItem item){
        foodRep.deleteById(this.searchByName(item.getName()).getID());
        foodRep.save(item);
        return String.valueOf(item.getID());
    }

    /**
     * Search method using the food name
     * @param name - name of the food being searched
     * @return details of food entry with the corresponding name
     */
    public FoodItem searchByName(String name){
        for (FoodItem food: foodRep.findAll()){
            if (food.getName().equalsIgnoreCase(name)){
                return food;}
        }
        return null;
    }

}
