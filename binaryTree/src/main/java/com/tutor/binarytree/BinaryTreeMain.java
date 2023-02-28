/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutor.binarytree;

/**
 *
 * @author mckin
 */
public class BinaryTreeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        
        //Display total number of possible binary tree with key 5
        System.out.println("Total number of possible BST: "+ bt.numOfBST(5));
        
        //Insert
        BTree rootnode = new BTree(25);
        System.out.println("Building tree with root value " + rootnode.value);  
        System.out.println("================================="); 
        
        bt.insert(rootnode, 11);
        bt.insert(rootnode, 15);
        bt.insert(rootnode, 16);
        bt.insert(rootnode, 23);
        
        
    }
    
}
