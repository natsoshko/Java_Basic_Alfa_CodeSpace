package com.alpha.work63;

import java.util.Scanner;

public class Task65 {
    public static void main(String[] args) {
        System.out.println("Enter height of Pyramid:");
        Scanner sc = new Scanner(System.in);
        int iHeight = sc.nextInt();
        printPyramid(iHeight);
    }

    public static void printPyramid(int height) {
        int line = 1;
        while (line <= height) {                // rows of Pyramid
            int iPos2 = (height - line);
            while (iPos2 > 0) {                 // spaces in rows at the beginning
                System.out.print("  ");
                iPos2--;
            }
            int iPos3 = 1;
            while (iPos3 < line) {              // digits increase
                System.out.print(iPos3 + " ");
                iPos3++;
            }
            int iPos1 = line;
            while (iPos1 >= 1) {                // digits decrease
                System.out.print(iPos1 + " ");
                iPos1--;
            }
            System.out.println();
            line++;
        }
    }
}
