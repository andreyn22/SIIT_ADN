//Display the max digit from a number.
//https://www.javatpoint.com/java-program-to-print-the-smallest-element-in-an-array

package main.java.ro.sci.HomeWork1;
public class alg3_MaxDigit {static void Digits(int n)
{
    int largest = 0;
    while(n != 0)
    {
        int r = n % 10;
        largest = Math.max(r, largest);
        n = n / 10;
    }
    System.out.println("The maxim digit from the number is: " + largest);
}
    public static void main (String[] args) throws java.lang.Exception
    {
        int n = 2346;
        Digits(n);

    }
}
