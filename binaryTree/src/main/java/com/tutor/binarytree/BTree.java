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
public class BTree {
    BTree left;
    BTree right;
    int value;

    public BTree(int value) {
        this.left = null;
        this.right = null;
        this.value = value;
    }
    
}
