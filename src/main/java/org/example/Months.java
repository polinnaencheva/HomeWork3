package org.example;

import java.util.Scanner;
public class Months {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number between 1 and 12: ");
            int monthNumber = scanner.nextInt();

            String month;
            switch (monthNumber) {
                case 1:
                    System.out.printf("The entered value was %d . The selected month was January." , monthNumber);
                    break;
                case 2:
                    System.out.printf("The entered value was %d . The selected month was February." , monthNumber);
                    break;
                case 3:
                    System.out.printf("The entered value was %d . The selected month was March." , monthNumber);
                    break;
                case 4:
                    System.out.printf("The entered value was %d . The selected month was April." , monthNumber);
                    break;
                case 5:
                    System.out.printf("The entered value was %d . The selected month was May." , monthNumber);
                    break;
                case 6:
                    System.out.printf("The entered value was %d . The selected month was June." , monthNumber);
                    break;
                case 7:
                    System.out.printf("The entered value was %d . The selected month was July." , monthNumber);
                    break;
                case 8:
                    System.out.printf("The entered value was %d . The selected month was August." , monthNumber);
                    break;
                case 9:
                    System.out.printf("The entered value was %d . The selected month was September." , monthNumber);
                    break;
                case 10:
                    System.out.printf("The entered value was %d . The selected month was October." , monthNumber);
                    break;
                case 11:
                    System.out.printf("The entered value was %d . The selected month was November." , monthNumber);
                    break;
                case 12:
                    System.out.printf("The entered value was %d . The selected month was December." , monthNumber);
                    break;
                default:
                    System.out.printf("Entered %d. Invalid selection." , monthNumber);
                    break;
            }


        }
    }


