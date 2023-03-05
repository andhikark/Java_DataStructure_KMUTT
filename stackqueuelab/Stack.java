/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackqueuelab;

/**
 *
 * @author User
 */
public class Stack {
    int[]st;
    int top;
    
    public Stack(int capacity){
        st = new int[capacity];
        top = 0;
    }
    
    public Stack(){
        this(100);
    }
    
    public boolean isFull(){
        return (top >= st.length);
    }
    
    public boolean isEmpty(){
        return top == 0;
    }
    
    public void push(int newMember){
     if(!isFull()){
         st[top] = newMember;
        top++;
     }else{
         System.out.println("Stack is full. It cannot add a new item.");
     }
    }
    
    public int pop(){
        int x = - 1;
        if(!isEmpty()){
            x = st[top - 1];
            top--;
        }else{
            System.out.println("Stack is empty.");
        }
        return x;
    }
    
    public int topEl(){
        int x = -1;
        if(!isEmpty()){
            x = st[top-1];
        }else{
            System.out.println("Stack is empty.");
        }
        return x;
    }
    public int size(){
        return top;
    }
    
    public void reverse(){
        int[] temp = new int[st.length];
        for(int i = 0 ; i< top;i++){
            temp[i] = st[top-(i + 1)];
        }
        st = temp;
    }
    
    public void reverse2(){//will go only n/2
        int temp;
        for(int i = 0; i < top/2;i++){
            temp = st[i];
            st[i] = st[top - (i + 1)];
            st[top-(i + 1)] = temp;
        }
    }
}
