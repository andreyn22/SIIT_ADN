package main.java.ro.sci.Pseudocode;
import java.util.Scanner;

public class pseudocode6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(
                "Enter an int value (the program stops if the sum is greater than 20): ");
        int data = input.nextInt();
        int sum = 0;
        while (sum < 20) {
            sum += data;
            System.out.print(
                    "Enter an int value (the program stops if the sum is greater than 20): ");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
 /*   Start

            sum = 0

    WHILE sum < 20
    READ x
    sum = sum + x
# x	sum
# 2	2
        # 5	7
        # 7	14
        # 8	22
    ENDWHILE

    PRINT sum
# PRINT 22

    End*/

