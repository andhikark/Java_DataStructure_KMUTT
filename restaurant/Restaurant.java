/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurant;

/**
 *
 * @author Student
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        food padthai = new food(1, "padthai", 49.99, 200 ,(short) 4);
        System.out.println(padthai.toString());
        padthai.setCategory("noodle");
        padthai.addIngredient("shrimp");
        padthai.addIngredient("noodle");
        padthai.addIngredient("bean sprout");
        padthai.addIngredient("egg");
        System.out.println(padthai.ingredients.elementAt(0) + " " + padthai.ingredients.elementAt(2) );
        food tomyum = new food(2, "tomyum", 249.50, 500, (short) 5);
        tomyum.setCategory("seafood");
        tomyum.addIngredient("shrimp");
        tomyum.addIngredient("lemon");
        tomyum.addIngredient("chilli pepper");
        food coke = new food(3, "Coca Cola", 20 , 150, (short) 3);
        food pepsi = new food(4, "Pepsi", 20 , 150, (short) 3);
        food fanta = new food(5, "Fanta", 20, 150, (short) 3);
        
        Menu menu = new Menu();
//        menu.addNewFood(padthai);
//        menu.addNewFood(pepsi);
//        menu.addNewFood(tomyum);
//        menu.addNewFood(coke);
//        menu.addNewFood(fanta);
        menu.showAllFood();
//        menu.removeFood(2);
//        menu.showAllFood();
        menu.readAllRecord();
        boolean x = menu.searchByName("Pepsi");
        System.out.println(x);
        menu.showNamePrice((short)4);
    }
    
}
