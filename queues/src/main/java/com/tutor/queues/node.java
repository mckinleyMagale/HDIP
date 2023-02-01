/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutor.queues;

/**
 *
 * @author mckin
 */
public class node {
    private int element;
    private node next;
    
    public node(int e)
    {
        this.element = e;
        this.next = null;
    }

    public int getElement()
    {
        return element;
    }
    
    public node getNext()
    {
        return next;
    }
    
    public void setElement(int newElement)
    {
        this.element = newElement;
    }
    
    public void setNext(node newNext)
    {
        this.next = newNext;
    }
}
