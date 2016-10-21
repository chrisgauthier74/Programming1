
/**
 * Write a description of class challengeThree here.
 * 
 * @author (your name)  
 * @version (a version number or a date)
 */

import java.util.Scanner;


public class challengeThree
{
   public static int positive,negative,number,totalnum,totalcount;
   public static double averagenum;
   
    public static void main (String[] args)     {
       
       System.out.println("Enter an int value (zero to end): ");
       Scanner keyboard = new Scanner(System.in);
       while ( (number = keyboard.nextInt() ) != 0) {
           System.out.println("Number is: " + number);
           totalcount = totalcount + number;
           if ( number > 0) {
               positive++;
            }
            if (number < 0 ) {
                negative++;
            }
            
        }
       if ( (positive > 0) || (negative > 0) ) {
        totalnum = positive + negative;
        averagenum = totalcount / totalnum;
        System.out.println("The number of positives is: " + positive);
        System.out.println("The number of negatives is: " + negative);
        System.out.println("The total is " + totalnum);
        System.out.println("The average is " + averagenum);
        
       
       }
       else {
           System.out.println("There are no positives or negatives");
        }
    }
}
