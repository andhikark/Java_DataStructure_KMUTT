/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sll_lab;

/**
 *
 * @author User
 */
public class SLL_Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SLLNode node1 = new SLLNode(30);
        System.out.println(node1.info+ " "+ node1.next);
        SLLNode node2 = new SLLNode(40,node1);
        //node2 -> node1
        System.out.println(node2.info+" ");
        System.out.println(node2.next.info);
        //node2.next = node1 => node2.next.info = node.info 
        //                                      = 30;
        //System.out.println(node1.next.info);
        //node1.next.info = null.info => error
        
        SinglyLinkedList list1 = new SinglyLinkedList();
        System.out.println(list1.head); //null
        list1.addToTail(66); // head and tail will point to node 66
        System.out.println(list1.head.info + " " + list1.tail.info);
        
        list1.addToTail(79);
        //66 -> 79
        System.out.println(list1.head.info + " " + list1.head.next.info);
        list1.addToHead(34);
        // 34 -> 66 -> 79
        System.out.println(list1.head.info + " " + list1.tail.info + " " + list1.head.next.next.info);
        list1.addToHead(71);
        //71 - 24 - 66 - 79
        System.out.println(list1.head.info + " 3rd="+list1.head.next.next.info
                           + " 4th=" + list1.head.next.next.next.info);
        
        list1.printAllNodes();
        list1.deleteFromHead();
        //71 - 34 - 66 - 79
        //34 - 66 - 79
        list1.printAllNodes();
        list1.addToHead(61);
        list1.addToHead(40);
        list1.addToTail(59);
        list1.addToHead(80);
        //80 -  50 - 61 - 34 - 66 - 79 - 59
        list1.printAllNodes();
        list1.deleteFromTail();
        list1.printAllNodes();
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.addToHead(99);
        list2.printAllNodes();
        //list2.deleteFromTail();
        //list2.printAllNodes();
    }
    
}
