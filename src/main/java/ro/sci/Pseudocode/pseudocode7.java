package main.java.ro.sci.Pseudocode;
import java.lang.module.ModuleDescriptor;
import java.util.Scanner;

public class pseudocode7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}

/*    Start

            REPEAT
    READ x
    UNTIL x IS ODD

    PRINT x

    End*/

