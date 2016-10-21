
/**
 * Write a description of class challengeFour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class challengeFour
{
          
   public static int i,multiple;
   public static void main (String[] args) {
       System.out.println("What is our multiple, sir? ");
       Scanner keyboard = new Scanner (System.in);
       multiple = keyboard.nextInt();
       
       for (i = 1; i <= 100; i++) {
           if (i % multiple == 0) {
               System.out.println("i = " + i);
            }
            if (i % 3 == 0) {
                System.out.println("Wowza");
            }
            if (i % 5 == 0) {
                System.out.println("Cowza");
            }
       }
       
    }   
}