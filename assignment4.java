import java.util.Scanner;
import java.lang.*;


/**
 * Write a description of class AssignmentFour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AssignmentFour
{
    public static void main (String[] args) 
    {
        String input;
        final double RESIDENTIAL_COMMISSION = 0.07;
        final double MULTIDWELLING_COMMISSION = 0.06;
        final double COMMERCIAL_COMMISSION =    0.35;   
        char testChar = 'y';
        char propertyCode;
        double sellingPrice;
        double tempCommission = 0;
        double totalSales = 0;
        double totalCommissions = 0;
        boolean found = false; 
        
  
        do 
        {
            
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\nReal-Estate Commission Calculator");
            System.out.println("-----------------------------------\n");
            System.out.print("Enter the properties selling price: ");
            
            input = keyboard.nextLine();
            sellingPrice = Integer.parseInt(input);
       
            if (sellingPrice < 0) 
            {
                System.out.println("**Error** - Selling price must be greater than 0");
                found = false;
            }
            
            System.out.println();
            System.out.println("Residential\tR");
            System.out.println("Multi-Dwelling\tM");
            System.out.println("Commercial\tC");
            System.out.print("Enter the property code: ");
            propertyCode = keyboard.next().charAt(0);
            propertyCode = Character.toLowerCase(propertyCode);
                
            
            if (propertyCode == 'r' || propertyCode == 'R')
            {
                tempCommission = RESIDENTIAL_COMMISSION * sellingPrice;
                totalCommissions += tempCommission;
                totalSales += sellingPrice;
                found = true;
            }
            else if (propertyCode == 'm' || propertyCode == 'M')
            {
                tempCommission = MULTIDWELLING_COMMISSION * sellingPrice;
                totalCommissions += tempCommission;
                totalSales += sellingPrice;
                found = true;
            }
            else if (propertyCode == 'c' || propertyCode == 'C') 
            {
                tempCommission = COMMERCIAL_COMMISSION * sellingPrice;
                totalCommissions += tempCommission;
                totalSales += sellingPrice;
                found = true;
            }
            else 
            {
                found = false;
            }
            if (found == false)
            {
                System.out.println("**Error** - Property Code must be R,M or C");
                found = false;
            }
            else if (found = true && testChar == 'y' ) 
            {
                System.out.println("Total Commission is " + tempCommission);
                System.out.print("Calculate another commission (y/n): ");
                testChar = keyboard.next().charAt(0);
                if ( testChar == 'y')
                {   
                    found = false;
                    testChar = 'y';
                    System.out.println("Calculate another commission (y/n): ");
                    
                }
                else if (testChar == 'n')
                {
                    found = true;
                    testChar = 'n';
                    System.out.println("Transaction Summary");
                    System.out.println("---------------------");
                    System.out.println("\nTotal property sales: $" + totalSales);
                    System.out.println("\nTotal Commissions: $" + totalCommissions);
                }
            } 
        } while (testChar == 'y' );
        
    }
}
    