/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package augustinejavaassn3;


public class AugustineMortgageCalculator {

    public static void describeProgram(){
        System.out.println("This program performs various mortgage calculations");
    }
    
    public static double calculateMonthlyPropertyTax(double purchasePrice){
        double purchasePricePercentage = 0.85;
        double adminFee = 35;
        double homeAssessedValue = purchasePricePercentage * purchasePrice;
        int monthsInYear = 12;
        double monthlyPropertyTax = (0.0063 * homeAssessedValue + adminFee) / monthsInYear;
        
        return monthlyPropertyTax;
    }
    
    public static void main(String[] args) {
        describeProgram();
        System.out.println(calculateMonthlyPropertyTax(101000));
    }
    
    /**   
    A main method to read the inputs from the user, display some values, and call the other methods.

    A method (1) to display a description of what the program will do.

    A method (2) to compute the monthly property tax..

    A method (3) to compute the monthly insurance premium.

    A method (4) to compute the monthly principle and interest loan payment.

    A method (5) to compute and display the results of the program.
   **/
    
}
