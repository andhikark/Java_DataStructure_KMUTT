public class DoubleLinkedList {
    public static void main(String[] args){

    }
}

class Node{
    int info;
    Node next,prev;
    Node(int el){
        this(el,null,null);
    }
    Node(int el, Node n, Node p){
        info = el;
        next = n;
        prev = p;
    }
}

class List{
    Node head, tail;
    List(){
        head = tail = null;
    }

    boolean isEmpty(){
        return head == null;
    }

    void addtoHead(int el){
        head = new Node(el,head,null);
        if(tail == null){
            tail = head;
        }
    }

    void addtoTail(int el){
        if(!isEmpty()){
            tail = new Node(el,null,tail);
            tail.prev.next = tail;
        }else{
            head = tail = new Node(el);
        }
    }

    void deleteFromHead(){
        if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
    }

    void deleteFromTail(){
        if(head ==  tail){
            head  = tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }
    }
}
