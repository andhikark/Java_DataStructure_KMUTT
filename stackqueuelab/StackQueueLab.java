/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackqueuelab;

/**
 *
 * @author User
 * Putu Andhika Restu Kurnia (65130500247)
 */
public class StackQueueLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack s1 = new Stack(10);
        s1.push(50);
        s1.push(100);
        s1.push(26);
//        System.out.println(s1.topEl());
//        s1.pop();
//        s1.pop();
//        System.out.println(s1.topEl());
//        s1.pop();
//        System.out.println(s1.topEl());
        s1.push(90);
        System.out.println(s1.topEl());
        s1.reverse();
        System.out.println(s1.topEl());
        s1.pop();
        System.out.println(s1.topEl());
        s1.reverse2();
        System.out.println(s1.topEl());
        BigNumber b1 = new BigNumber("123456789");
        BigNumber b2 = new BigNumber("5432109876");
        b1.add(b2);
        BigNumber b3 = b1.add(b2);
        System.out.println(b3.toString());
        CSQueue q1 = new CSQueue(5);
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(60);
        q1.enqueue(2);
        q1.enqueue(70);
        System.out.println(q1.firstEl());
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        System.out.println(q1.firstEl());
        
    }
    
}
