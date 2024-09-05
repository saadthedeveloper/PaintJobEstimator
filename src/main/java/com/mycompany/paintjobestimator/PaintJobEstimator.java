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
        double totalOfWallSpace = 0;
        double numberOfGallons;
        double hoursOfLabor;
        double paintCost;
        double laborCharges;
        double totalCost;
        String input;
        int index = 1;

        input = JOptionPane.showInputDialog("Enter the numbers of rooms to be painted");
        numberOfRooms = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the price of paint per gallon");
        priceOfPaintPerGallon = Double.parseDouble(input);

        while (index <= numberOfRooms) {
            input = JOptionPane.showInputDialog("Enter the wall space of room (in square feet)" + index);
            totalOfWallSpace += Double.parseDouble(input);
            index++;
        }

        numberOfGallons = numberOfGallons(totalOfWallSpace);
        hoursOfLabor = hoursOfLabor(totalOfWallSpace);
        paintCost = paintCost(totalOfWallSpace);
        laborCharges = laborCharges(totalOfWallSpace);
        totalCost = totalCost(laborCharges, paintCost);
        
        System.out.println(numberOfGallons);
        System.out.println(hoursOfLabor);
        System.out.println(paintCost);
        System.out.println(laborCharges);
        System.out.println(totalCost);

    }

    /*
    
     */
    public static double numberOfGallons(double totalOfWallSpace) {
        double gallonsNeeded = totalOfWallSpace / 115;
        /*As 1 gallon covers 115 square feet of area*/
        return gallonsNeeded;
    }

    public static double hoursOfLabor(double totalOfWallSpace) {
        /*for square feet of wall to be covered 4.17 minutes will be required*/
        int index = 1;
        double hoursOfLabor = 0;
        while (index <= totalOfWallSpace) {
            hoursOfLabor += 4.17;
            index++;
        }
        return hoursOfLabor;
    }
    
    public static double paintCost(double totalOfWallSpace) {
        /*0.008695 gallons of paint is required for every squarefeet of wall to be covered*/
        int index = 1;
        double paintCost = 0;
        while (index <= totalOfWallSpace) {
            paintCost += 0.008695;
            index++;
        }
        return paintCost;
    }
    
    public static double laborCharges(double totalOfWallSpace) {
        /*for every minute of work the labor cost is 0.0375*/
        double laborCharges = 0;
        double hoursOfLabor = hoursOfLabor(totalOfWallSpace);
        int index = 1;
         
        while (index <=  hoursOfLabor) {
            laborCharges += 0.0375;
            index++;
        }
        return laborCharges;
    }
    
    public static double totalCost(double laborCharges, double paintCost) 
    { 
        double totalCost = 0;
        totalCost += (laborCharges + paintCost);
        return totalCost;
    }
}
