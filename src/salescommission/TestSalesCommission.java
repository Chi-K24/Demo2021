/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salescommission;

/**
 *
 * @author Chi T. Le - 991185018>
 */
import java.util.Scanner;
public class TestSalesCommission {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     //Scanner class used to ask user for input
        
        System.out.println("Enter total sales amount: ");           //Scanner prompts in DOS and ask user to input a double value
        
        double commissionEarned = input.nextDouble();           //Scanner assigns value inputted by user and stores the variable
        
        SalesCommission comm1 = new SalesCommission(commissionEarned);          //Calling statement for SalesCommission class and runs commissionEarned method
        
        System.out.println("The commission earned is: $" + comm1.computeCommission()+ " for sales amount of $" + commissionEarned);         //Prints computed commission and total sales amount
    }
    
}           //END
