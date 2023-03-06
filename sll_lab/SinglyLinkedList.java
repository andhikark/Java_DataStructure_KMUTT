//package DataStructure;

public class SinglyLinkedList {
    public static void main(String[] args){  
        LList list1 = new LList();
        list1.addtoHead(2);      
        list1.addtoTail(3);
        list1.addtoHead(1);
        list1.printAll();
        System.out.println();
        list1.addtoHead(4);
        list1.addtoTail(7);
        list1.printAll();
        System.out.println();
        list1.deleteFromHead();
        list1.deleteFromTail();
        list1.printAll();
        System.out.println();
        list1.inLIst(4);
        list1.delete(2);
        System.out.println();
        list1.printAll();
    }
}

class Node{
    int info;
    Node next;
    Node(int i){
        this(i,null);
    }
    Node(int i, Node n){
        info = i;
        next = n;
    }
}

class LList{
    Node head, tail;
    LList(){
        head = tail = null;
    }

    boolean isEmpty(){
        return head == null;
    }

    void addtoHead(int el){
        head = new Node(el,head);
        if(tail == null){
            tail = head;
        }
    }

    void addtoTail(int el){
        if(head != null){   
            tail.next = new Node(el);
            tail = tail.next;
        }else{
            head = tail = new Node(el);
        }
    }

    int deleteFromHead(){
        int el = head.info;
        if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
        return el;
    }

    int deleteFromTail(){
        int el = tail.info;
        if(head == tail){
            head = tail = null;
        }else{
            Node temp;
            for(temp = head; temp.next != tail;temp = temp.next);
            tail = temp;
            tail.next = null;
        }
        return el;
    }

    void printAll(){
        for(Node temp = head; temp != null;temp = temp.next){
            System.out.print(temp.info + " -> ");
        }
        
    }

    boolean inLIst(int el){
        Node temp;
        for(temp = head; temp != null && temp.info != el;temp = temp.next);
        return temp != null;
    }

    void delete(int el){
        if(!isEmpty()){
            if(head == tail && el == head.info){//one node
                head = tail = null;
            }else if(el == head.info){//el in head
                head = head.next;
            }else{//non head
                Node pred,temp;
                for(pred = head, temp = head.next; temp != null && temp.info != el;pred = pred.next,temp = temp.next);
                if(temp != null){ //el found
                    pred.next = temp.next;
                    if(temp == tail){ //el last node
                        tail = pred;
                    }
                }
            }
        }
    }
}   



