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
public class BinaryTree {
    private BTree root;

    public BinaryTree() {
        this.root = null;
    }
    
    public int factorial(int num)
    {
        int fact = 1;
        if(num == 0)
        {
            return 1;
        }
        else
        {
            while(num>1)
            {
                fact=fact*num;
                num--;
            }
            return fact;
        }
    }
    
    //Calculates total number of possible Binary trees by calculating Catalan numbers for a given key
    public int numOfBST(int key)
    {
        //catalan = a sequence of natural numbers that occur in various counting problems
        int catalanNum = factorial(2*key)/(factorial(key+1)*factorial(key));
        return catalanNum;
    }
    
    public void insert(BTree node, int value)
    {
        if(value < node.value)
        {
            if(node.left != null)
            {
                insert(node.left, value);
            }
            else
            {
                System.out.println("Inserted "+value+" to the left node "+ node.value);
                node.left = new BTree(value);
            }
        }
        else if(value > node.value)
        {
            if(node.right != null)
            {
                insert(node.right, value);
            }
            else
            {
                System.out.println("Inserted "+value+" to the right node "+ node.value);
                node.right = new BTree(value);
            }
        }
    }
    
    //Inorder traversal of a BT
    public void inorder(BTree temp)
    {
        temp = root;
        if(temp == null)
        {
            System.out.println("Tree is empty");
        }
        inorder(temp.left);
        System.out.print(temp.value+ " ");
        inorder(temp.right);
    }
}
