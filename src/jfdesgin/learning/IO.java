package jfdesgin.learning;

import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //imput

        System.out.println("whats your name?"); //output
        String name = reader.nextLine(); //imput

        System.out.println("Nice to meet you "+ name);
        }
}
