package main.java.ro.sci.Pseudocode;

import java.util.Scanner;

public class pseudocode2 {
    public static void main(String[] args) {
        int price;
       Scanner writeNumber = new Scanner(System.in);
        System.out.println("Please type the price here: ");
       price = writeNumber.nextInt();
        if (price < 20){
            System.out.println("label =  green");
        } else if (price < 30){
            System.out.println("label = yellow");
        } else {
            System.out.println("label = red");
        }
    }
}

//https://www.youtube.com/watch?v=YptY7Ld8FcE
//https://www.javatpoint.com/java-if-else