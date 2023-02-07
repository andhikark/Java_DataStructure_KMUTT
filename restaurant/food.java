/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

import java.util.Vector;

/**
 *
 * @author Putu Andhika Restu Kurnia 65130500247
 */
public class food {
    int ID;
    String name;
    String category;
    double price;
    int calories;
    short star;
    Vector ingredients;

    public food(int ID, String name, double price, int calories, short star) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.star = star;
        ingredients = new Vector(10);
    }
    
    public void setCategory(String category){
        String[] validCategory  = {"noodle", "beef", "pork", "vegetables", "seafood", "chicken", "dessert", "drinks"};
        boolean flag = true;
        for(String a:validCategory){
            if(category.equalsIgnoreCase(a)){
                this.category = category;
            }else{
                flag = false;
            }
        }
        if(flag){
            System.out.println("Not valid category");
        }else{
            System.out.println("Item has been added successfully");
        }
    }
    
    public int addIngredient(String newIngredient){
        ingredients.add(newIngredient);
        return ingredients.size();
    }
    
    @Override
    public String toString(){
        return name+ " - " + price+ "baht with " + star + "*."; 
    }
   
}
