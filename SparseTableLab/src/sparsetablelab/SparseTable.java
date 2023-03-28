/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sparsetablelab;

/**
 *
 * @author User
 */
public class SparseTable {
    RegisterNode[] students;
    RegisterNode[] classes;
    
    public SparseTable(int studentAmount,int classAmount){
        students = new RegisterNode[studentAmount];
        classes = new RegisterNode[classAmount];
    }
    
    public RegisterNode addRegister(int newStudentId, int newClassId){
        if(!isRegister(newStudentId,newClassId)){
            RegisterNode newRegis = new RegisterNode(newStudentId, newClassId);
            RegisterNode temp;
            //student has never register 
            if(students[newStudentId] == null){
                students[newStudentId] = newRegis;
            }
            //newClass will be the first class
            else if(newClassId < students[newStudentId].courseID){
                newRegis.nextClass = students[newStudentId];
                students[newStudentId] = newRegis;
            }else{
            for(temp = students[newStudentId];temp.nextClass != null && temp.nextClass.courseID < newClassId; temp = temp.nextClass){}
            newRegis.nextClass = temp.nextClass;
            temp.nextClass = newRegis; 
            }
            // work among students under the same class 
            
            if(classes[newClassId] == null){
                classes[newClassId] = newRegis;
            }
            //newClass will be the first class
            else if(newStudentId < classes[newClassId].studentID){
                newRegis.nextStudent = classes[newClassId];
                classes[newClassId] = newRegis;
            }else{
            for(temp = classes[newClassId];temp.nextStudent != null && temp.nextStudent.studentID < newStudentId; temp = temp.nextStudent){}
            newRegis.nextStudent = temp.nextStudent;
            temp.nextStudent = newRegis; 
            }
            return newRegis;
        }
        return null;
    }
    public RegisterNode addRegister(int newStudentId, int newClassId,int grade){
        RegisterNode n = addRegister(newStudentId,newClassId);
        if(n != null){
            n.setGrade(grade);  
            return n;
        }
        return null;
    }
    
    public double calculateGPA(int studentId){
        double[] gradePoint = {4.0,3.7,3.3,3.0,2.7,2.3,2.0,1.7,1.3,1.0,0};
        
        double totalGradePoints = 0;
        int numberOfClasses = 0;
        for(RegisterNode temp = students[studentId];temp != null;temp = temp.nextClass){
            totalGradePoints += gradePoint[temp.grade];
            numberOfClasses++;
        }
        return totalGradePoints/numberOfClasses;
    }
    
    public boolean isRegister(int studentId, int classId){
        RegisterNode temp;
        if(students[studentId] == null){
            return false;
        }else{
            for(temp = students[studentId];temp != null && temp.courseID < classId;temp = temp.nextClass){}
            if(temp == null || temp.courseID > classId){
                return false;
            }else{
                return true;
            }
        }
    }
    
    public void listAllClasses(int studentId){
        RegisterNode temp;
        System.out.println("\nStudent ID : " + studentId);
        
        for(temp = students[studentId];temp != null;temp = temp.nextClass){
            System.out.print(temp.courseID + " ");
        }
        System.out.println("");
    }
    
     public void listAllStudent(int classId){
        RegisterNode temp;
        System.out.println("\nCourse ID : " + classId);
        
        for(temp = classes[classId];temp != null;temp = temp.nextStudent){
            System.out.print(temp.studentID + " ");
        }
        System.out.println("");
    }
    
    
}
