/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortinglab;

/**
 *
 * @author User
 */
public class SortingLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data d1 = new Data(100);
        d1.addNewInfo(507);
        d1.addNewInfo(100);
        d1.addNewInfo(9401);
        d1.addNewInfo(9);
        d1.addNewInfo(40);
        d1.addNewInfo(1200);
        d1.addNewInfo(2195);
        d1.addNewInfo(60);
        d1.addNewInfo(834);
        d1.addNewInfo(25);
        d1.addNewInfo(512);
        d1.addNewInfo(30);
        
        Data d2 = new Data(100);
        d2.clone(d1);
        d2.printAll();
        System.out.print("  Selection sort : ");
        d2.selectionSort();
        d2.printAll();
        
        Data d3 = new Data(100);
        d3.clone(d1);
        d3.printAll();
        System.out.print("  Insertion sort : ");
        d3.insertionSort();
        d3.printAll();
        
        Data d4 = new Data(100);
        d4.clone(d1);
        d4.printAll();
        System.out.print("  Bubble sort : ");
        d4.bubbleSort();
        d4.printAll();
        
        Data d5 = new Data(100);
        d5.clone(d1);
        d5.printAll();
        System.out.print("  Quick sort : ");
        d5.quickSort(0,d5.size-1);
        d5.printAll();
        
        Data d6 = new Data(100);
        d6.clone(d1);
        d6.printAll();
        System.out.print("  Radix sort : ");
        d6.radixSort();
        d6.printAll();
        
        Data d7 = new Data(100);
        d7.clone(d1);
        d7.printAll();
        System.out.print("  Merge sort : ");
        d7.mergeSort(0,d7.size-1);
        d7.printAll();
        
        Data d8 = new Data(100);
        d8.clone(d1);
        d8.printAll();
        System.out.print("  Shell sort : ");
        d8.shellSort();
        d8.printAll();
    }
    
}
