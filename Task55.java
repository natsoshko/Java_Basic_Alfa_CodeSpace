package com.alpha.work55;

public class Task55 {
    public static void main(String[] args) {
        String str = "Tesla Roadster";  //TlRodtr
        //int iLen = str.length();
        String sBuf = "";
        int i = 0;
        while (i < str.length()) {
            char chTemp = str.charAt(i);
            if(chTemp != ' ') {
                if (str.indexOf(chTemp) == str.lastIndexOf(chTemp)) {
                    sBuf += chTemp;
                }
            }
            i++;
        }
        System.out.println(sBuf);
    }
}
