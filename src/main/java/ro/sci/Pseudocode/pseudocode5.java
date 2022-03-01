package main.java.ro.sci.Pseudocode;

import java.util.Scanner;

public class pseudocode5 {
    public static void main(String args[])
    {
        int n, i, f = 1;
        System.out.println("Enter the number to calculate its factorial");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if (n < 0)
            System.out.println("Number should be non-negative.");
        else
        {
            for (i = 1; i <= n; i++)
                f = f*i;
            System.out.println("Factorial of "+n+" is = "+f);
        }
    }
}
/*    Start

    READ n
    result = 1

    FOR i=1 i<=n
            result = result*i
# result = 1, 2, 6, 24, 120, ...
    ENDFOR

    PRINT result

    End
    */


