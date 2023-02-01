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
        boolean resp = false;
        if(qSize == 0)
        {
            resp = true;
        }
        return resp;
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
        if(head == null)
        {
            head = tail = newNode;
            qSize++;
        }
        else
        {
            tail.setNext(newNode);
            tail = newNode;
            qSize++;
        }
        
    }
    
    public node serve()
    {
        node resp = null;
        
        if(head != null)
        {
            if(head.getNext() != null)
            {
                resp = new node(head.getElement());
                head = head.getNext();
                qSize--;
            }
            else
            {
                resp = new node(head.getElement());
                head = null;
                tail = null;
                qSize--;
            }   
        }
       return resp;
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
                System.out.print(temp.getElement());
                
                temp = temp.getNext();
                if(temp!=null)
                    System.out.print(",");
            }
        }
    }
}
