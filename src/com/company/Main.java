package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bizChoice;
        do {
            System.out.println("Choose a business from below");
            System.out.println("");
            System.out.println("1. Taco Bell");
            System.out.println("2. Five Guys");
            System.out.println("3. Popeye's");
            System.out.println("4. Portillo's");
            System.out.println("5. Chic-Fil-A");
            bizChoice = in.nextInt();
        } while (bizChoice != 1 && bizChoice != 2 && bizChoice != 3 && bizChoice != 4 && bizChoice != 5);
        switch (bizChoice) {
            case 1:
                System.out.println("You chose Taco Bell");
                break;
            case 2:
                System.out.println("You chose Five Guys");
                break;
            case 3:
                System.out.println("You chose Popeye's");
                break;
            case 4:
                System.out.println("You chose Portillo's");
                break;
            case 5:
                System.out.println("You chose Chic-Fil-A");
                break;
            default:
                System.out.println("Thank you for your time");
        }
    }
}