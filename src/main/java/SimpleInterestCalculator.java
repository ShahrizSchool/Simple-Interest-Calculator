/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shahrizmalek
 */
import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args){
        System.out.println("Welcome to Simple Interest Calculator!");
        Scanner input = new Scanner(System.in); // scanner 
        
        double simpleInterest; // define simple interest
        
        System.out.println("Enter Principle Amount "); // ask user for principle amount 
            double pAmount = input.nextDouble(); // define principle amount 
        System.out.println("Enter Rate of Interest "); // Ask user for rate of interest
            double rateInterest = input.nextDouble(); //define rate of interest 
        System.out.println("Enter Time in Years ");//Ask user for Time 
            double time = input.nextDouble(); //define the time in years 
        //Simple Interest = (Principle Amount * Rate of Interest * Time in Years / 100)
        
        if (pAmount > 0 && rateInterest > 0 && time > 0) {
            
        simpleInterest = pAmount * rateInterest * time / 100; //Calculate The simple interest 
        
        System.out.println("The simple interest is " + simpleInterest); // the calculated simple interest
        System.out.println("The Principle Amount is " + pAmount + " usd"); //Print out principle amt 
        
        } else {
            System.out.println("DUMBASs, GOTTA BE A POSTIVE! ");
        }
        input.close(); //Close Scanner 
    
    }
}
