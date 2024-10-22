package org.example;

import java.util.Scanner;
public class Rectangle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Въведете дължина на правоъгълник: ");
            double length = scanner.nextDouble();

            System.out.print("Въведете ширина на правоъгълник: ");
            double width = scanner.nextDouble();

            // Изчисляваме лицето и периметъра на правоъгълника
            double area = length * width;
            double perimeter = 2 * (length + width);

            System.out.println("Лицето на правоъгълника е: " + area);
            System.out.println("Периметъра на правоъгълника е: " + perimeter);
        }
    }


