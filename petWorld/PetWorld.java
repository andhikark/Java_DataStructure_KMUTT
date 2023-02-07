/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petWorld;

/**
 *
 * @author Student ID : 65130500247
 *         Name       : Putu Andhika Restu Kurnia
 * 
 */
public class PetWorld {
    public static void main(String[] args) {
        Pet p1 = new Pet("Leub", 111, "Female");
        System.out.println(p1.name + " " + p1.getGender());
        Pet p2 = new Pet("Deng", 112, "Mixing" );
        System.out.println(p2.name + " " + p2.getGender());
        //p2.gender = "Mixer";
        //after set private gender cannot be accessed directly
        p2.setGender("Mixer");
        System.out.println(p2.name + " " + p2.getGender());
        p2.setType("raptor");
        System.out.println(p2.name + " " + p2.getType());
        p1.setType("crocodile");
        System.out.println(p1.name + " " + p1.getType());
        
        Vaccine v1 = new Vaccine("GK26", "CoVid", "Pfizu", 5);
        Vaccine v2 = new Vaccine("GT11", "Cancer", "Moderna", 100);
        System.out.println(v2.getCompany()+ " "+ v2.getDose());
        
        p1.vaccinate(v2);
        p1.vaccinate(v1);
        System.out.println(p1.getVaccineCount());
        System.out.println(p2.getVaccineCount());
        p1.showAllPreventDiseases();
        p2.showAllPreventDiseases();
    }
}
