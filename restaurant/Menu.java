/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Putu Andhika Restu Kurnia 65130500247
 */
public class Menu {
    food[] foods;
    int amountOfFood;
    String filename;
    
    public Menu(){
        foods = new food[30];
        amountOfFood = 0;
        filename = "menu_Andhika.dat";
    }
    
    public int addNewFood(food newFood){
        foods[amountOfFood] = newFood;
        amountOfFood++;
        writeOneFoodtoFile(newFood);
        return amountOfFood;
    }
    
    public boolean removeFood(int foodID){
        for (int i = 0; i < amountOfFood; i++) {
            if(foods[i].ID == foodID){
                for(int j = i; j < amountOfFood-1; j++){
                    foods[j] = foods[j+1];
                }
                amountOfFood--;
                return true;
            }
        }
        return false;
    }
    
    public void showAllFood(){
        for (int i = 0; i < amountOfFood; i++) {
            System.out.println(foods[i].ID + ")" + foods[i].name + " ");
        }
        System.out.println("");
    }
    // int ID;                      4 bytes
    // String name;                 20 bytes
    // String category;             20 bytes
    // double price;                8 bytes
    // int calries;                 4 bytes
    // short star;                  2 bytes
    // Vectore ingredient;          200 bytes
    
    public boolean searchByName(String nameFood){
        try {
            RandomAccessFile fptr = new RandomAccessFile(filename,"r");
            //fprt is point to byte number 0;
            byte[] temp = new byte[20];
//            fptr.seek(4);
//            fptr.read(temp,0, 20);
//            System.out.println(new String(temp) + " ");
//            
//            fptr.seek(fptr.getFilePointer() + 258-20);
//            // move from the current location (end of the first name)
//            // for 258 bytes (get us the end of the second name)
//            //the move back 20 bytes (get us the beginneing of the second name
//            fptr.read(temp,0, 20);
//            System.out.println(new String(temp) + " ");
//            
//            fptr.read(temp,0, 20);
//            System.out.println(new String(temp) + " ");
//            
//            fptr.seek(258 + 4);
//            //Move pointer to the end of the first record
//            fptr.read(temp,0, 20);
//            System.out.println(new String(temp) + " ");
//            
//            fptr.seek(258*2 + 4);
//            fptr.read(temp,0, 20);
//            System.out.println(new String(temp) + " ");
            int record = 0; 
            while(fptr.getFilePointer() < fptr.length()){
                fptr.seek(258 * record + 4); //skip the one record at a time
                fptr.read(temp,0,20);
                String foodNameFromFile = (new String(temp)).trim();
                if(foodNameFromFile.equalsIgnoreCase(nameFood)){
                    //fptr.seek(fptr.getFilePointer() + 20);
                    fptr.seek(258*record + 44);
                    double price = fptr.readDouble();
                    System.out.println("Price of " + nameFood+ " is "  + price);
                    return true;
                }
                record++;
            }

            
             fptr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch(IOException ex){
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; 
    }
    
    public void showNamePrice(short fromStar){
        try {
            RandomAccessFile fpt = new RandomAccessFile(filename,"r");
            byte[] temp = new byte[20];
            for (int record = 0; fpt.getFilePointer() < fpt.length()- 257; record++) {
                fpt.seek(record*258 + 56);//get to star of the record
                short starFromFile = fpt.readShort();
                if(starFromFile >= fromStar){
                    fpt.seek(record*258+4);
                    fpt.read(temp,0,20);
                    fpt.seek(record*258+44);
                    double price = fpt.readDouble();
                    System.out.println((new String(temp)).trim() + ": " + price );
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void readAllRecord(){
        
        try {
            RandomAccessFile fptr = new RandomAccessFile(filename,"r");
            while(fptr.getFilePointer() < fptr.length()){
                byte[] temp = new byte[20];
                int id = fptr.readInt();
                System.out.print(id + " ");
                fptr.read(temp,0,20);
                System.out.print(new String(temp).strip() + " ");
                fptr.read(temp,0,20);
                System.out.println(new String(temp).strip() + " ");
                double p = fptr.readDouble();   //price
                int cal = fptr.readInt();
                short star = fptr.readShort();
                
                System.out.println(p + " " + cal + " " + star + " ");
                // read 10 ingredients
                String ingredient = "";
                for(int i = 0; i < 10; i++){
                    fptr.read(temp, 0, 20);
                    ingredient += new String(temp).trim() + ", ";
                }
                System.out.println(ingredient);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean writeOneFoodtoFile(food fd){
        try {
            RandomAccessFile fpointer = new RandomAccessFile(filename, "rw");
            fpointer.seek(fpointer.length());
            byte[] temp = new byte[30];
//            String stName = "Putu Andhika 65130500247";
//            temp = stName.concat("                              ").getBytes();
//            fpointer.write(temp, 0, 30);
            fpointer.writeInt(fd.ID);
            
            temp = fd.name.concat("                              ").getBytes();
            fpointer.write(temp, 0, 20);
            
            if(fd.category != null){
                temp = fd.category.concat("                              ").getBytes();
            }else{
                temp = "".concat("                              ").getBytes();
            }
            fpointer.write(temp, 0, 20);
            fpointer.writeDouble(fd.price);
            fpointer.writeInt(fd.calories);
            fpointer.writeShort(fd.star);
            int i=0,j;
            for(j=0; j<fd.ingredients.size();j++){
                String t = ((String) fd.ingredients.elementAt(j));
                temp = t.concat("                    ").getBytes();
                fpointer.write(temp,0,20);
            }
            
            for (i+= j; i < 10; i++) {
                temp = "                    ".getBytes();
                fpointer.write(temp, 0, 20);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
}
