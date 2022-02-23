//Calculate the sum of the first 100 numbers higher than 0
// sum = sum + i;

package main.java.ro.sci.HomeWork1;
public class alg1_Sum {
    public static void main(String[] args) {
        int num = 100, sum = 0;
        for(int i = 1; i <= num; ++i)
        {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
