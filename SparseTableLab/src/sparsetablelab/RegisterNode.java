/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sparsetablelab;

/**
 *
 * @author User
 */
public class RegisterNode {
    int studentID;
    int courseID;
    int grade;
    RegisterNode nextStudent;
    RegisterNode nextClass;

    public RegisterNode(int studentID, int courseID, int grade, RegisterNode nextStudent, RegisterNode nextClass) {
        this.studentID = studentID;
        this.courseID = courseID;
        this.grade = grade;
        this.nextStudent = nextStudent;
        this.nextClass = nextClass;
    }

    public RegisterNode(int studentID, int courseID, int grade) {
        this(studentID, courseID, grade, null, null);
    }

    public RegisterNode(int studentID, int courseID) {
        this(studentID, courseID, 10, null, null);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
