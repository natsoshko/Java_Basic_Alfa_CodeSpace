package com.alpha.work24;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        System.out.print("Enter the 3-digit number: ");
        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();
        while (iNum < 100 || iNum >= 1000) {
            System.out.println("Your number isn't 3-digit. Enter the 3-digit number:");
            iNum = sc.nextInt();
        }
        int iBuf = iNum;
        //System.out.println ("Before reverse the number = " + iNum);
        System.out.print ("After reverse the number = ");
        //System.out.print(iNum % 10);
        int iTemp = (iNum % 10)*100;
        iNum = iNum / 10;
        //System.out.print(iNum % 10);
        iTemp += (iNum % 10) * 10;
        iNum = iNum / 10;
        //System.out.println(iNum % 10);
        iTemp += (iNum % 10);
        System.out.println(iTemp);
        int iRes = iTemp - iBuf;
        System.out.println(iTemp + " - " + iBuf + " = " + iRes);


        /*// reverse using cycle
        System.out.print("Enter the 3-digit number: ");
        Scanner sc2 = new Scanner(System.in);
        int iNum2 = sc2.nextInt();
        System.out.print ("After reverse the number = ");
        System.out.print(iNum2 % 10);
        while ( (iNum2 /= 10) != 0) {
            System.out.print(iNum2 % 10);
        }
        */
    }
}
