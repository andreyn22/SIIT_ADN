//Display all the prime numbers lower than a given number
//https://www.alphacodingskills.com/java/pages/java-program-find-all-prime-numbers-less-than-the-given-number.php

package main.java.ro.sci.HomeWork1;
public class primeNumbers {
    static void primenumber(int MyNum) {
        int n = 0;
        for(int i = 2; i < (MyNum/2+1); i++) {
            if(MyNum % i == 0){
                n++;
                break;
            }
        }
        if (n == 0){
            System.out.print(MyNum + " ");
        }
    }
    public static void main(String[] args) {
        int x = 70;
        System.out.println("Prime numbers less than "+ x + " are: ");
        for(int i = 2; i < x + 1; i++) {
            primenumber(i);
        }
    }
}
