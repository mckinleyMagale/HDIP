/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutor.queues;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mckin
 */
public class queueMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int element;
        
        linkedQ queue = new linkedQ();
        
        System.out.println("Enter a number :");
        for(int i=0;i<5;i++)
        {
            element = input.nextInt();
            queue.append(element);
        }
        
        System.out.println("Size of the Queue is "+queue.size());
        System.out.println("Head of the Queues = " + queue.front());
        
        queue.serve();
        System.out.println("Head of the Queues = " + queue.front());
        
        queue.serve();
        queue.serve();
        System.out.println("Head of the Queues = " + queue.front());
        
        queue.append(60);
        System.out.println("Head of the Queues = " + queue.front());
        
        System.out.println("In Queue: ");
        queue.display();
    }
    
}
