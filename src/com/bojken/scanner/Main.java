package com.bojken.scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       do {

           System.out.println("Input Number!");
           int result = scanner.nextInt();

           System.out.println("You picked: " + result);
       } while (true);
    }
}
