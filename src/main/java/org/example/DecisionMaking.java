package org.example;

import java.util.Scanner;
public class DecisionMaking {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Въведи първото число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Въведи второто число: ");
            double num2 = scanner.nextDouble();

            System.out.print("Въведи третото число: ");
            double num3 = scanner.nextDouble();

            double largest;

            if (num1 >= num2 && num1 >= num3) {
                largest = num1;
            } else if (num2 >= num1 && num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }

            System.out.println("Най-голямото число е: " + largest);
        }
    }


