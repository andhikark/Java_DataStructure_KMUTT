/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petWorld;

import java.util.Date;

/**
 *
 * * @author Student ID : 65130500247
 *         Name       : Putu Andhika Restu Kurnia
 */
public class Pet {
   String name;
    //Date dateOfBirth;
    String[] colors;
    int ID;
    private String type;
    private String gender;
    //Owner
    private Vaccine[] vaccines;
    private int vaccineCount;

    public Pet(String name, int ID, String gender){
        this.name = name;
        this.ID = ID;
        //this.gender = gender;
        this.setGender(gender);
        vaccines = new Vaccine [100];
        vaccineCount =0;
    }
    
    public int vaccinate(Vaccine v){
        vaccines[vaccineCount] = v;
        vaccineCount++;
        return vaccineCount;
    }

    public int getVaccineCount() {
        return vaccineCount;
    }

    
    public void setGender(String gender){
        if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")){
            this.gender = gender;
        } else {
            System.out.println("Animal genders are only male and female.");
            this.gender = "unknown";
        }
    }

    public String getType(){
        return type;
    }

    public String getGender(){
        return gender;
    }

    public boolean setType(String type){
        String[] typeList = {"dog", "cat", "fish", "rabbit", "bird", "chicken", "python", "raptor", "worm", "cricket"};
       for(int i  = 0; i < typeList.length; i++){
        if(type.equalsIgnoreCase(typeList[i])){
            this.type = type;
            return true;
        }
       }
       //if the code is here, type parameter is not in the type list 
        this.type = "unkown";
        return false;
    }
    
    public void showAllPreventDiseases(){
        for(int i=0; i<vaccineCount; i++){
            if(vaccines[i].getPreventedDisease() != null){
                System.out.println("This animal is immune to "+ vaccines[i].getPreventedDisease());
            }
        }
    }
    
        
}
