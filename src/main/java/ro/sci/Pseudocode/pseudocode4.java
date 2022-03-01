//package main.java.ro.sci.Pseudocode;

import java.util.Scanner;

public class pseudocode4 {
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int number_Of_DaysInMonth = 0;
        String MonthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
}
    /*Start

    READ index

    CASE index OF
 1: PRINT 31
            2: PRINT 28
            3: PRINT 31
            4: PRINT 30
            5: PRINT 31
            6: PRINT 30
            7: PRINT 31
            8: PRINT 31
            9: PRINT 30
            10: PRINT 31
            11: PRINT 30
            12: PRINT 31
    OTHERS: PRINT Introduceti un numar intre 1 si 12
    ENDCASE

            End
*/
// https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-7.php?fbclid=IwAR0-R2zAgE-qRqm3xbt5qbNjIRxEXfT--Sz-UPY0O_J8uKIX3SyFwHZVnKM
