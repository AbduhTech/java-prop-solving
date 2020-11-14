/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Q3;
import java.util.Scanner;
public class Assignment_Q3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num,k,Sum_Occ=0,Sum_Un_Occ=0,Sum=0;
      float Rooms_Occ=0;
      Scanner input = new Scanner (System.in);
      
        System.out.println("Enter the number of floors:");
        num=input.nextInt();
        int Floors[]=new int[num];
        int Occ[]= new int [num];
        int Un_Occ[]= new int [num];
        if (num>=1){
        
            for ( k=0;k<Floors.length;k++){
                System.out.println("the number of occupied rooms in floor?");
                Occ[k]=input.nextInt();
                Sum_Occ=Sum_Occ+Occ[k];
                System.out.println("the number of unoccupied rooms?");
                Un_Occ[k]=input.nextInt();
                Sum_Un_Occ=Sum_Un_Occ+Un_Occ[k];
                Sum=Sum_Un_Occ+Sum+Sum_Occ;
                 Rooms_Occ= (Sum_Occ/Sum)*100;
                
                
            }
           
            
          System.out.printf("%-13s | %-15s | %-12s | %-12s | %-12s","Floor No.","No.Of Rooms","Occupied rooms"," Unoccupied Rooms","Percentage of Occupied Rooms\n");
          System.out.println("----------------------------------------------------------------------------------------------------------");
          System.out.printf("%-20d %-20d %-20d %-18d %-25.2f",num,Sum,Sum_Occ,Sum_Un_Occ,Rooms_Occ);
           } 
        else {
            System.out.println("Error! Invalid number of floors.");
        }
    }
    
          
        
    }
    

