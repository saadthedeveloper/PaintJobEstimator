/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.paintjobestimator;

import javax.swing.JOptionPane;

/**
 * This program estimates the cost of a paint job based on the number of rooms,
 * wall space, paint cost, and labor required. It calculates the gallons of
 * paint needed, hours of labor required, and the associated costs for paint and labor.
 * The total cost of the paint job is then displayed.
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
        paintCost = paintCost(numberOfGallons, priceOfPaintPerGallon);
        laborCharges = laborCharges(hoursOfLabor);
        totalCost = totalCost(laborCharges, paintCost);

        JOptionPane.showMessageDialog(null, "Gallons of paint required: " + String.format("%.2f", numberOfGallons));
        JOptionPane.showMessageDialog(null, "Hours of labor required: " + String.format("%.2f", hoursOfLabor));
        JOptionPane.showMessageDialog(null, "Cost of paint: $" + String.format("%.2f", paintCost));
        JOptionPane.showMessageDialog(null, "Labor charges: $" + String.format("%.2f", laborCharges));
        JOptionPane.showMessageDialog(null, "Total cost of the paint job: $" + String.format("%.2f", totalCost));

    }

    /**
     * This method calculates the number of gallons of paint required.
     *
     * @param totalOfWallSpace The total wall space to be painted (in square
     * feet).
     * @return The number of gallons of paint required.
     */
    public static double numberOfGallons(double totalOfWallSpace) {
        double gallonsNeeded = totalOfWallSpace / 115;
        /*As 1 gallon covers 115 square feet of area*/
        return gallonsNeeded;
    }

    /**
     * This method calculates the total hours of labor required for the paint
     * job.
     *
     * @param totalOfWallSpace The total wall space to be painted (in square
     * feet).
     * @return The total hours of labor required (based on 8 hours per 115
     * square feet).
     */
    public static double hoursOfLabor(double totalOfWallSpace) {
        return (totalOfWallSpace / 115) * 8;
    }

    /**
     * This method calculates the total cost of paint.
     *
     * @param numberOfGallons The total number of gallons of paint required.
     * @param pricePerGallon The price of a single gallon of paint.
     * @return The total cost of paint for the job.
     */
    public static double paintCost(double numberOfGallons, double pricePerGallon) {
        return numberOfGallons * pricePerGallon;
    }

    /**
     * This method calculates the total labor charges for the paint job.
     *
     * @param hoursOfLabor The total hours of labor required.
     * @return The total labor charges (based on $18 per hour).
     */
    public static double laborCharges(double hoursOfLabor) {
        double laborRate = 18.00;  // Labor rate is $18 per hour
        return hoursOfLabor * laborRate;
    }

    /**
     * This method calculates the total cost of the paint job (labor + paint).
     *
     * @param laborCharges The total labor charges.
     * @param paintCost The total cost of paint.
     * @return The total cost of the paint job.
     */
    public static double totalCost(double laborCharges, double paintCost) {
        double totalCost = 0;
        totalCost += (laborCharges + paintCost);
        return totalCost;
    }
}
