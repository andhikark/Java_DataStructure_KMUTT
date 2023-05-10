/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heaplab;

/**
 *
 * @author User
 */
public class HeapLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Heap h = new Heap(10);
        h.enqueue(50);
        h.enqueue(20);
        h.enqueue(300);
        h.enqueue(60);
        h.enqueue(250);
        h.enqueue(500);
        h.enqueue(10);
        h.printAll();
        System.out.println(h.dequeue());
        h.printAll();
        h.heapSort();
        h.printAll();
        
    }
    
}
