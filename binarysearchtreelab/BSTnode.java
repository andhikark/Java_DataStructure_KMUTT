/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarysearchtreelab;

/**
 *
 * @author User
 */
public class BSTnode {
    int info;
    BSTnode left,right;

    public BSTnode(int info, BSTnode left, BSTnode right) {
        this.info = info;
        this.left = left;
        this.right = right;
    }

    public BSTnode(int info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }
    
    public void visit(){
        System.out.print(info+" ");
    }
    
    
}
