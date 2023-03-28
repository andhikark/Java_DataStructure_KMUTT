/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sparsetablelab;

/**
 *
 * @author User
 */
public class SparseTableLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SparseTable sp1 = new SparseTable(1000,200);
        sp1.addRegister(50, 101,0);
        RegisterNode temp = sp1.students[50];
        System.out.println(sp1.students[50].courseID);
        
        sp1.addRegister(50, 110,3);
        System.out.println(sp1.students[50].nextClass.courseID);
        
        sp1.addRegister(50, 105,1);
        System.out.println(sp1.students[50].nextClass.courseID);
        System.out.println(sp1.students[50].nextClass.nextClass.courseID);
        
        sp1.listAllClasses(50);
        
        sp1.addRegister(60,105);
        sp1.listAllStudent(105);
        sp1.addRegister(65,105);
        sp1.listAllStudent(105);
        sp1.addRegister(40,105);
        sp1.listAllStudent(105);
        sp1.addRegister(55,105);
        sp1.listAllStudent(105);
        
        System.out.println(sp1.calculateGPA(50));
    }
    
}
