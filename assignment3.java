import java.util.Scanner;

/**
 * Write a description of class AssignmentThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AssignmentThree
{
    public static void main (String[] args) 
    {
        int day,year,month;
        String monthName;
        boolean found = false;

        System.out.println("Day: ");
        Scanner keyboard = new Scanner(System.in);
        day = keyboard.nextInt();

        System.out.println("Month: ");
        month = keyboard.nextInt();

        System.out.println("Year: ");
        year = keyboard.nextInt();

        switch (month)
        {   
            case 1: monthName = "January";
            break;
            case 2: monthName = "February";
            break;
            case 3: monthName = "March";
            break;
            case 4: monthName = "April";
            break;
            case 5: monthName = "May";
            break;
            case 6: monthName = "June";
            break;
            case 7: monthName = "July";
            break;
            case 8: monthName = "August";
            break;
            case 9: monthName = "September";
            break;
            case 10: monthName = "October";
            break;
            case 11: monthName = "November";
            break;
            case 12: monthName = "December";
            break;
            default: monthName = "Invalid Month";
            //( (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) )
        }
        if ( (day == 29) && monthName.equals("February") && ! ( (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ))
        {
            System.out.println("February only has 29 days on a leap year!");
            found = true;
        }
        else if (monthName.equals("February") && ( (day > 28) && (day < 1) ) ) 
        { 
            System.out.println("February only has 28 days");
            found = true;        }
            //good to here
        else if ( (monthName.equals("April") || monthName.equals("September") || monthName.equals("November") ) && ( (day > 30) || (day < 1) ) ){
            System.out.println(day + " is an invalid day for the month specified");
            found = true;
        }
        else if (day < 1 || day > 31) {
            System.out.println("[X] Invalid day value");
            found = true;
        }

        else if (month < 1  || month > 12) {
            System.out.println("[X] Invalid month value");
            found = true;
        }

        else if (year < 1582)
        {
            System.out.println("[X] Invalid year value");
            found = true;
        }
        if (found == false)
        {
            System.out.println(monthName + " " + day + "," + year);
        }

    }
}
