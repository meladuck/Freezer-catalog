package com.example.h2demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Class representing a record which can be saved in the H2 database for the Freezer Catalog.
 */
@Entity
public class FoodItem {
    
    /*
    * Primary key for the H2 table */
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    /*
    * Name of food to be added */
    private String name;
    /*
    * Type of food to be added */
    private String type;
    /*
    * Quantity of specified food */
    private int quantity;

    /*
    * Default class constructor */
    protected FoodItem(){}

    /**
     * Class constructor with entity information
     * @param name - name of food
     * @param quantity - quantity of food
     * @param type - food type
     */
    public FoodItem( String name, int quantity, String type){
        this.name = name;
        this.type = type;
        this.quantity = quantity;
    }

    /**
     * 
     * @return entity ID
     */
    public long getID(){
        return this.id;
    }

    /**
     * 
     * @return entity name
     */
    public String getName(){
        return this.name;
    }

    /**
     * 
     * @return entity type
     */
    public String getType(){
        return this.type;
    }

    /**
     * 
     * @return entity quantity
     */
    public int getQuantity(){
        return this.quantity;
    }

    /**
     * 
     * @param name - new name to update entity
     */
    public void setName(String name){
        this.name=name;
    }

    /**
     * 
     * @param quantity - new quantity to update entity
     */
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    /**
     * 
     * @param type - new type to update entity
     */
    public void setType(String type){
        this.type=type;
    }

}

