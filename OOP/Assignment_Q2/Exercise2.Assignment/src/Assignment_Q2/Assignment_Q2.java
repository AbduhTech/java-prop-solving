/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Q2;
import java.util.Scanner;
/**
 *
 * @author Nafi
 */
public class Assignment_Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    int num, Sal;
    double NSal = 0,subtract,allowance;
    char Housing;
        System.out.println("Please enter the number of employees:");
        num=input.nextInt();
        for (int i=0;i<num;i++){
            System.out.println("Please enter your Salary:");
            Sal=input.nextInt();
            System.out.println("Have you applied the allowance for this month? Enter Y for YES and N for NO");
            Housing=input.next().charAt(0);
            
            if (Sal>=1 && Sal<=3000 &&  Housing=='Y'){
              subtract= 0.91*(Sal*0.95);
             allowance= Sal*0.03;
            NSal= allowance + subtract;    
            }
            else if (Sal>=3001 && Sal<=5000 && Housing=='Y'){
                subtract= (Sal*0.91)*0.93;
                allowance=Sal*0.03;
                NSal=allowance+subtract;
            }
            else if (Sal>=5001 && Sal<=7000 && Housing=='Y'){
                subtract=(Sal*0.89)*0.93;
                allowance=Sal*0.05;
                NSal = allowance+subtract;
            }
            else if (Sal>=7001 && Sal<=9000 && Housing=='Y'){
                subtract=(Sal*0.87)*0.87;
                allowance=Sal*0.05;
                NSal=allowance+subtract;
            }
            else if (Sal>=9001 && Sal<= 12000 && Housing=='Y'){
                subtract=(Sal*0.85)*0.87;
                allowance=Sal*0.05;
                NSal=allowance+subtract;
            }
            else if (Sal>12000 && Housing=='Y'){
                subtract=(Sal*0.8)*0.89;
                allowance=Sal*0.07;
                NSal=allowance+subtract;
            }
            else if (Sal>=1 && Sal<=3000 &&  Housing=='N'){
              subtract= (Sal*0.95)*0.91;
            NSal=subtract; }
            
            else if (Sal>=3001 && Sal<=5000 && Housing=='N'){
                subtract= (Sal*0.91)*0.93;
                NSal=subtract;}
            
            else if (Sal>=5001 && Sal<=7000 && Housing=='N'){
                subtract=(Sal*0.89)*0.93;
                NSal=subtract;}
            
            else if (Sal>=7001 && Sal<=9000 && Housing=='N'){
                subtract=(Sal*0.87)*0.87;
                NSal=subtract;
            }
            
            else if (Sal>=9001 && Sal<= 12000 && Housing=='N'){
                subtract=(Sal*0.85)*0.87;
                NSal=subtract;}
            
            else if (Sal>12000 && Housing=='N'){
                subtract=(Sal*0.8)*0.89;
                NSal=subtract;
            }
            
            System.out.println("The Net Salary is:" +NSal);
        }
        
    
    }
    
}
