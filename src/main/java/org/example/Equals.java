package org.example;

import java.util.Scanner;
public class Equals {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Въведи число: ");
            int number = scanner.nextInt();

            // Проверка дали числото е четно или нечетно
            if (number % 2 == 0) {
                System.out.println("Числото е четно.");
            } else {
                System.out.println("Числото е нечетно.");
            }
        }
    }


