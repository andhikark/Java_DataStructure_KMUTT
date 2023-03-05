/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackqueuelab;

/**
 *
 * @author User
 */
public class CSQueue {
    int[] q;
    int first,last;
    
    public CSQueue(int capacity){
        q = new int[capacity];
        first = last = -1;
    }
    public boolean isEmpty(){
        return first == -1;
    }
    
    public boolean isFull(){
        return (first == 0 && last == q.length-1) || last == first-1;
    } 
    
    public void enqueue(int newElement){
        if(!isFull()){
           if(last == q.length-1){
                last = 0;
            }else{
                last++;
            }
            q[last] = newElement; 
            if(first == -1){
                first = 0;
            }
        }else{
            System.out.println("Queue is full");
        }
        
        
    }
    public int dequeue(){
        int x = -1;
        if(!isEmpty()){
            x = q[first];
            if(first == last){
                first = last = -1;
            }
            else if(first == q.length-1){
                first = 0;
            }else{
                first++;   
            }
        }else{
            System.out.println("Queue is empty");
        }
        
        return x;
    }
    public int firstEl(){
        int x = -1;
        if(!isEmpty()){
            x = q[first];
        }else{
            System.out.println("Queue is empty.");
        }
        return x;
    }
}
