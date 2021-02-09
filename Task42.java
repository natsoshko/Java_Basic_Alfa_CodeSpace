package com.alpha.work42;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit 1...9: ");
        int x = sc.nextInt();
        // using if-else
        if (x == 1) {
            System.out.print(x + " is One");
        } else if (x == 2) {
            System.out.print(x + " is Two");
        } else if (x == 3) {
            System.out.print(x + " is Three");
        } else if (x == 4) {
            System.out.print(x + " is Four");
        } else if (x == 5) {
            System.out.print(x + " is Five");
        } else if (x == 6) {
            System.out.print(x + " is Six");
        } else if (x == 7) {
            System.out.print(x + " is Seven");
        } else if (x == 8) {
            System.out.print(x + " is Eight");
        } else if (x == 9) {
            System.out.print(x + " is Nine");
        } else {
            System.out.print(x + " is Others");
        }

        /* // using switch
        switch (x) {
            case 1:
                System.out.print(x + " is One");
                break;
            case 2:
                System.out.print(x + " is Two");
                break;
            case 3:
                System.out.print(x + " is Three");
                break;
            case 4:
                System.out.print(x + " is Four");
                break;
            case 5:
                System.out.print(x + " is Five");
                break;
            case 6:
                System.out.print(x + " is Six");
                break;
            case 7:
                System.out.print(x + " is Seven");
                break;
            case 8:
                System.out.print(x + " is Eight");
                break;
            case 9:
                System.out.print(x + " is Nine");
                break;
            default:
                System.out.print(x + " is Others");
        }
        */
    }
}
