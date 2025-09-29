package ie.atu;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
        //Setup scanner
        System.out.println("Please enter an operation");

        //get operation
        Scanner scan1 = new Scanner(System.in);
        String operation = scan1.next();
        System.out.println(operation);

        Calculator myCalc = new Calculator();

        System.out.println("Simple Calculator - Add Two Numbers");
        System.out.println("Enter first number: ");
        int firstnumber = scan1.nextInt();
        System.out.println("Enter second number: ");
        int secondnumber = scan1.nextInt();

        int result = myCalc.add_numbers(firstnumber, secondnumber);
        System.out.println("The total is " + result);

        scan1.close();
    }
}
