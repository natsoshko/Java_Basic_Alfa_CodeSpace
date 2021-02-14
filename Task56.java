package com.alpha.work56;

import java.util.Scanner;

public class Task56 {
    public static void main(String[] args) {
        String str = "What is the best Canon camera in 2021 ?";
        System.out.println(str);
        System.out.println("Enter position of word:");
        Scanner sc = new Scanner(System.in);
        int iPos = sc.nextInt();
        int iCountSpace = 0;    // count of spaces
        int i = 0;
        while (i < str.length()) {
            char chTemp = str.charAt(i);
            if(chTemp == ' ') {
                iCountSpace++;
            }
            i++;
        }
        if (iPos > 0 && iPos <= (iCountSpace+1)) {
            if (iPos == 1) {                            // first word
                int iFirst = str.indexOf(' ');
                System.out.println("The word at position " + iPos + " is: " + str.substring(0, iFirst));
            } else if (iPos == (iCountSpace + 1)) {     // last word
                int iLast = str.lastIndexOf(' ');
                System.out.println("The word at position " + iPos + " is: " + str.substring(iLast+1));
            } else {
                int j = 0;
                int iCurSpace = 0;
                while (j < str.length()) {
                    char chTemp = str.charAt(j);
                    if (chTemp == ' ') {
                        iCurSpace++;
                        if ((iPos - 1) == iCurSpace) {
                            String sBuf = str.substring((j+1));                     // copy string str from current position in string sBuf.
                            String sWord = sBuf.substring(0, sBuf.indexOf(' '));    // searching word
                            System.out.println("The word at position " + iPos + " is: " + sWord);
                            break;
                        }
                    }
                    j++;
                }
            }
        } else {
            System.out.println("The entered position is out of range!");
        }
        //System.out.println(iCountSpace);
    }
}
