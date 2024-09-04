/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.paintjobestimator;

import javax.swing.JOptionPane;

/**
 *
 * @author MKAY
 */
public class PaintJobEstimator {

    public static void main(String[] args) {
        int numberOfRooms;
        double priceOfPaintPerGallon;
        double wallSpaceInEachRoom = 0;
        String input;
        int index = 1;

        input = JOptionPane.showInputDialog("Enter the numbers of rooms to be painted");
        numberOfRooms = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter the price of paint per gallon");
        priceOfPaintPerGallon = Double.parseDouble(input);
        
        while(index < numberOfRooms)
           {
               input = JOptionPane.showInputDialog("Enter the wall space of room " + index);
               wallSpaceInEachRoom += Double.parseDouble(input);
           }

}
    /*
    
    */
        public static double numberOfGallons(int numberOfrooms, double wallSpaceInEachRoom)                
       
           
           
           
        }
}