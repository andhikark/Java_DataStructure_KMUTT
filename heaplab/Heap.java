/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heaplab;

/**
 *
 * @author User
 */
public class Heap {
    int[] heap;
    int size;
    
    public Heap(int capacity){
        heap = new int[capacity];
        size = 0;
    }

    public Heap(){
        this(100);
    }
    
    public boolean isFull(){
        return (size >= heap.length);
    }
    
    public boolean isEmpty(){
        return (size == 0);
    }
    
    public void printAll(){
        for(int i = 0 ; i < size;i++){
            System.out.print(heap[i] + " ");
        }
        System.out.println("");
    }
    
    public void enqueue(int newInfo){
        if(!isFull()){
            heap[size] = newInfo;
            int newValueIndex = size;
            size++;
            int parentIndex = (newValueIndex-1)/2;
            //move up 
            while(newValueIndex > 0 && heap[parentIndex] < heap[newValueIndex]){
                //swap
                int temp = heap[newValueIndex];
                heap[newValueIndex] = heap[parentIndex];
                heap[parentIndex] = temp;
                newValueIndex = parentIndex;
                parentIndex = (newValueIndex-1)/2;
            }
        }else{
            System.out.println("Heap is full");
        }
    }
    public int dequeue(){
        int root;
        if(!isEmpty()){
            root = heap[0];
            int lastElement = heap[size - 1];
            heap[0] = lastElement;
            size--;
            //move down
            int lastElementIndex = 0;
            int leftChildOfLastElement = (lastElementIndex*2) + 1;
            int rightChildOfLastElement = (lastElementIndex*2) + 2;
            while((leftChildOfLastElement < size && heap[lastElementIndex] < heap[leftChildOfLastElement]) 
                    || (rightChildOfLastElement < size && heap[lastElementIndex] < heap [rightChildOfLastElement])){
                int swapIndex;
                if(leftChildOfLastElement == size - 1){
                    swapIndex = leftChildOfLastElement;
                }else if(heap[leftChildOfLastElement] > heap[rightChildOfLastElement]){
                    swapIndex = leftChildOfLastElement;
                }else{
                    swapIndex = rightChildOfLastElement;
                }

                //swap
                int temp = heap[lastElementIndex];
                heap[lastElementIndex] = heap[swapIndex];
                heap[swapIndex] = temp;
                lastElementIndex = swapIndex;

                leftChildOfLastElement = (lastElementIndex*2) + 1;
                rightChildOfLastElement = (lastElementIndex*2) + 2;
                }
        }else{
            System.out.println("Heap is Empty");
            root = -1;
        }       
        
        return root;
    }
    
    public void heapSort(){
        for(int last = size -1; last > 0;last--){
            //swap root with last 
            int temp = heap[last];
            heap[last] = heap[0];
            heap[0] = temp;
            //move down from the root 
            int lastElementIndex = 0;
            int leftChildOfLastElement = (lastElementIndex*2) + 1;
            int rightChildOfLastElement = (lastElementIndex*2) + 2;
            while((leftChildOfLastElement < last && heap[lastElementIndex] < heap[leftChildOfLastElement]) 
                    || (rightChildOfLastElement < last && heap[lastElementIndex] < heap [rightChildOfLastElement])){
                int swapIndex;
                if(leftChildOfLastElement == last-1){
                    swapIndex = leftChildOfLastElement;
                }else if(heap[leftChildOfLastElement] > heap[rightChildOfLastElement]){
                    swapIndex = leftChildOfLastElement;
                }else{
                    swapIndex = rightChildOfLastElement;
                }

                //swap
                temp = heap[lastElementIndex];
                heap[lastElementIndex] = heap[swapIndex];
                heap[swapIndex] = temp;
                lastElementIndex = swapIndex;

                leftChildOfLastElement = (lastElementIndex*2) + 1;
                rightChildOfLastElement = (lastElementIndex*2) + 2;
                }
            
        }
    }
        
}
