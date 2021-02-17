package com.alpha.work63;

import java.util.Scanner;

public class Task63 {
    public static void main(String[] args) {
        String str = "What is the best Canon camera in 2021 ?";
        System.out.println(str);
        System.out.println("Enter position of word:");
        Scanner sc = new Scanner(System.in);
        int numberWord = sc.nextInt();
        String sSearchWord = getSearchWord(str, numberWord);
        System.out.println("'" + getFirstCharacterOfWord(sSearchWord) + "'" + " is a symbol of word '" + sSearchWord + "' at position " + numberWord);
    }

    public static String getSearchWord(String str, int numberWord) {
        String sResult = "";
        int iLen = str.length();
        int iCountSpace = 0;    // count of spaces
        int i = 0;
        while (i < iLen) {
            char chTemp = str.charAt(i);
            if(chTemp == ' ') {
                iCountSpace++;
            }
            i++;
        }

        if (numberWord <= 0 || numberWord > (iCountSpace+1)) {
            sResult = "The entered position is out of range!";
        } else {
            int iFirst = str.indexOf(' ');
            int iLast = str.lastIndexOf(' ');
            if (numberWord == 1) {                              // first word: from beginning to first space
                sResult = str.substring(0, iFirst);
            } else if (numberWord == (iCountSpace + 1)) {       // last word: from ending to last space
                sResult = str.substring(iLast+1);
            } else {
                int j = iFirst+1;                               //next char after first space
                int iCurSpace = 0;
                while (j < iLast) {
                    int iPos = str.indexOf(' ', j);             // find next space position
                    iCurSpace++;
                    if ((numberWord - 1) != iCurSpace) {
                        j = iPos;
                    }
                    else {
                        sResult = str.substring(j, iPos);
                        break;
                    }
                    j++;
                }
            }
            //System.out.println(sResult);
        }
        return sResult;
    }

    public static char getFirstCharacterOfWord(String sWord) {
        char cSearchChar = sWord.charAt(0);
        return cSearchChar;

        //return sWord.charAt(0);
    }

}
