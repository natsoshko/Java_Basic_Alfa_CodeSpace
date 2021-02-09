package com.alpha.work46;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter digit: ");
        int iDig = sc.nextInt();
        int iSum = 0;
        System.out.print("Sqrt sum = ");
        while (iDig > 10) {
            int iTemp = iDig % 10;
            System.out.print(iTemp + "*" + iTemp + " + ");
            iSum += iTemp * iTemp;
            //System.out.print(":" + iSum + ":");
            iDig /= 10;
            //System.out.print("#" + iDig + "#");
        }
        System.out.print(iDig + "*" + iDig);
        iSum += iDig * iDig;
        System.out.println(" = " + iSum);

    }
}
