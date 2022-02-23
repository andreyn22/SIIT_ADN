//Display the smallest number from an array of number

package main.java.ro.sci.HomeWork1;
public class alg2_SmallestNumber {
    public static void main(String[] args)
    {
        int[] initializedArray
                = new int[] { 15, 16, 72, 18, -1, 20 };
        System.out.println("Having array:");

        for (int i = 0; i < initializedArray.length; i++) {
            System.out.println(initializedArray[i]);
        }
            int minValue = initializedArray[0];
        for (int i = 0; i < initializedArray.length; i++) {
            if (initializedArray[i] < minValue)
                minValue = initializedArray[i];
        }
        System.out.println("The smallest element is: " + minValue);
    }
}
