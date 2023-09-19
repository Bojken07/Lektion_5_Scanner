package com.bojken.scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isPlaying = true;

       do {

         int result = scannerNumber();

         for (int i = 0; i < result; i++){
             System.out.println(i);
             System.out.println("Looping...");
         }

          if (result == 1000) {
              System.out.println("The number is 0");
          }

       } while (isPlaying);

    }

    public static int scannerNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a number");

         return scanner.nextInt();
    }

    public static String scannerText() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert some sentence");
        String input = scanner.nextLine();

        return input;
    }
}
