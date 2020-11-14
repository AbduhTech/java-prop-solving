/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
public class Assignment_Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
	String Name;
	float Cal, Gra, Calories;
        
	System.out.println("Enter the food's name:");
	Name = input.next();
        
	System.out.println("Enter The Number Of Calories Per Serving: ");
	Cal = input.nextInt();
        
	System.out.println("Enter the amount of grams per serving:");
	Gra = input.nextInt();
        Calories = ((Gra*9/Cal));
        
        if (Calories<=0.3){
            float P_O_cal;
            P_O_cal=(Calories*100)/100;
            System.out.printf("The percentage of calories from food is:%.2f", P_O_cal);
            System.out.println(); //skips line
            System.out.println("Congratulations, the food meets the American Heart Association recommendation");
        }
        
        else {
            float P_O_cal;
            P_O_cal = (Calories*100)/100;
            System.out.printf("Thee percentage of calories from food is:%.2f", P_O_cal);
            System.out.println(); //skips line
            System.out.println("unfortunately, The food does not meet the American Heart Association recommendation");
            }
    }
    
}
