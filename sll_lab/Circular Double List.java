//Circular Doubly Linked List
class IntCDLLNode {
    public int info;
    public IntCDLLNode next, prev;
    public IntCDLLNode(int el){
        this(el, null, null);
    }
    public IntCDLLNode(int el, IntCDLLNode next, IntCDLLNode prev){
        info = el;
        this.next = next;
        this.prev = prev;
    }
}

public class IntCDLList {
    protected IntCDLLNode head, tail;
    public IntCDLList(){
        head = tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addToHead(int el){
        head = new IntCDLLNode(el, head, tail);
        tail.next = head;
        if(tail == null){
            tail = head;
        }
    }
    public void addToTail(int el){
        if(!isEmpty()){
            tail = new IntCDLLNode(el, head, tail);
            tail.prev.next = tail;
            head.prev = tail;
        }
    }
    public int deleteFromHead(){
        int el = head.info;
        if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
        return el;
    }
    public int deleteFromTail(){
        int el = head.info;
        if(head == tail){
            head = tail = null;
        }else{
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
        return el;
    }
    public void delete(int el){
        if(!isEmpty()){
            if(head == tail && head.info == el){
                head = tail = null;
            }
            else if(head.info == el){
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
            else if(tail.info == el){
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
            }
            else{
                IntCDLLNode tmp;
                for(tmp = head; tmp.next != head && tmp.info != el; tmp = tmp.next);
                if (tmp.next != head){
                    tmp.prev.next = tmp.next;
                    tmp.next.prev = tmp.prev;
                    if(tmp == tail){
                        tail = tmp.prev;
                    }
                }
            }
        }
    }
}