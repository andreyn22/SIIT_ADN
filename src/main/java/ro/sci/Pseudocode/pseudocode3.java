package main.java.ro.sci.Pseudocode;
import java.util.Scanner;
public class pseudocode3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Input the first number: ");
        double a = input.nextInt();
        System.out.print("Input the second number: ");
        double b = input.nextInt();
        double x = (b / a);
        System.out.println();
        System.out.println("The division of b and a is:" +x);
    }
}

/*    Start

    READ a
    READ b

    x = b / a

    PRINT x

    End
*/
//https://www.w3resource.com/java-exercises/basic/java-basic-exercise-3.php