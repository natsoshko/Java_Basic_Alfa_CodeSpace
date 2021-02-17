package com.alpha.work63;

import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {
        System.out.println("Enter the positive number:");
        Scanner sc = new Scanner(System.in);
        int iNumber = sc.nextInt();

        if (iNumber <= 0) {
            System.out.println("Error! It isn't positive number.");
        } else {
            String sBinary = convertDecimalToBinary(iNumber);
            System.out.println(sBinary + " - convert number in Binary System");
        }
    }

    public static String convertDecimalToBinary(int number) {
        int iTemp;
        String sBuf = "";
        while(number > 0 ) {
            iTemp = number%2;
            sBuf += iTemp;
            number = number/2;
        }
        // Reverse string
        String sRes = "";
        int iLen = sBuf.length();
        while (iLen > 0 ) {
            iLen--;
            sRes += sBuf.charAt(iLen);

        }
        return sRes;
    }
}
