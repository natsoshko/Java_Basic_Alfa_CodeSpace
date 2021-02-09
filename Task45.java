package com.alpha.work45;

import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) {
        // using while cycle
        int i = 1;
        int j = 1;
        System.out.println("* |  1  2  3  4  5  6  7  8  9");
        System.out.println("------------------------------");
        while (i < 10) {
            System.out.print(i + " | ");
            while (j < 10) {
                int iBuf = i*j;
                if (iBuf > 9) {
                    System.out.print(iBuf + " ");
                } else {
                    System.out.print(" " + iBuf + " ");
                }
                j++;
            }
            i++;
            j = 1;
            System.out.println();
        }

/*      // using for cycle
        System.out.println("* |  1  2  3  4  5  6  7  8  9");
        System.out.println("------------------------------");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j < 10; j++ ) {
                if (i*j > 9) {
                    System.out.print(i*j + " ");
                } else {
                    System.out.print(" " + i*j + " ");
                }
                //System.out.print(i*j + " ");
            }
            System.out.println();
        }
*/
    }
}
