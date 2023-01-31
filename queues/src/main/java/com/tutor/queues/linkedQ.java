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
public class linkedQ {
    private node head,tail;
    private int qSize;
    
    public linkedQ()
    {
        this.head = null;
        this.tail = null;
        this.qSize = 0;
    }
    
    public int size()
    {
        return qSize;
    }
    
    public node getTail()
    {
        return tail;
    }
    
    public boolean isEmpty()
    {
        return (qSize == 0);
    }
    
    public int front()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
        return head.getElement();
    }
   
    public void append(int object) //Insert an element
    {
        node newNode = new node(object);
        
        //if Queue is empty, then new node is front and rear
        if(tail == null)
        {
            head = tail = newNode;
        }
        
        tail.next = newNode;
        tail = newNode;
        qSize++;
    }
    
    public void serve()
    {
        //If queue is empty, state it
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
        
        //Store previous head and move head pointer one node ahead
        node tempNode = head;
        head = head.next;
        
        //if head becomes null, change tail pointer as null
        if(isEmpty())
        {
            tail = null;
        }
    }
    
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
        else
        {
            node temp = head;
            while(temp != null)
            {
                System.out.print(temp.element);
                
                temp = temp.next;
                if(temp!=null)
                    System.out.print(",");
            }
        }
    }
}
