/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuzina;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Kuzina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        /*String st = "Hello Word";

        byte b = 100;
        short salary = 1000;
        int x = 10, y = 10;
        long timelnMillisconds = 100000;
        double d = 1234.56;
        float f = 1234.56f;
        char ch1 = 'A', ch2 = 12;
        boolean b1 = true, b2 = false;
        System.out.println(b + " " + salary + " " + x + " " + y + " " + d + " " + f);
        System.out.println(ch1 + " " + ch2);
        System.out.println(b1 + " " + b2);
        System.out.println(timelnMillisconds);*/

        /*console*/
        /*System.out.format("The value of e is %-10.4f%n", Math.E);
        System.out.printf("The value of pi is %-10.5f%n", Math.PI);
        System.out.printf(Locale.ENGLISH, "Using locale: %,d%n", 123456789);
        final double PI = (double) 22 / 7;//CONSTANT
        System.out.printf(String.join("%n",
                "Using argument index:",
                "First number:%1$-5d",
                "Second number:%2$5d",
                "PI:%3$.20f%n"), 123, 456, PI);*/
        
        /*Scanner*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.printf("Your number is %d%n",number);
         System.out.print("Enter your name: ");
         String name = scanner.next();
         System.out.printf("Hello, %s%n",name);*/
         /*console*/
        /* Console console = System.console();
         String username = console.readLine("Введите имя");
         System.out.println("Привет, "+username);*/
        
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя");
        String username = reader.readLine();
        System.out.println("Привет "+username);
         
        
    }

}
