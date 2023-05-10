/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarysearchtreelab;

/**
 *
 * @author User
 */
public class BinarySearchTreeLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BSTtree tree1 = new BSTtree();
        tree1.insert(59);
        tree1.insert(100);
        tree1.insert(20);
        tree1.insert(200);
        
        System.out.println(tree1.root.info);
        System.out.println(tree1.root.right.info);
        System.out.println(tree1.root.right.right.info);
        System.out.println(tree1.root.left.info);
        BSTnode s = tree1.search(1000);
        if(s!= null){
            System.out.println(s.info);
        }else{
            System.out.println("not found");
        }
        
        tree1.insert(31);
        tree1.insert(43);
        tree1.insert(150);
        tree1.insert(1911);
        
        tree1.preorderTraversalIterative();
        System.out.println("");
        tree1.preorderTraversalRecursion(tree1.root);
        System.out.println("");
        tree1.inorderTraversalRecursion(tree1.root);
        System.out.println("");
        tree1.postorderTraversalRecursion(tree1.root);
        System.out.println("");
        
//        tree1.deleteByMerging(59);//delete root
//        System.out.println("\n" + tree1.root.info);
//        System.out.println(tree1.root.right.right.right.info);

//        tree1.deleteByMerging(31);
//        System.out.println("\n" + tree1.root.left.right.info);

//        tree1.deleteByMerging(200);
//        System.out.println("\n" + tree1.root.right.right.right.info);

        tree1.deleteByMerging(150);
        System.out.println("\n" + tree1.root.right.right.left.info);
    }
    
}
