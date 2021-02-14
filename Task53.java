package com.alpha.work53;

public class Task53 {
    public static void main(String[] args) {
        String str = "An information system is designed to collect, process store and distribute information";
        int iFirst = str.indexOf(' ');
        int iLast = str.lastIndexOf(' ');
        String sFirst = str.substring(0, iFirst);
        String sLast = str.substring(iLast+1, str.length());
        String sMiddle = str.substring(iFirst, iLast+1);
        String sResult = (sLast.concat(sMiddle)).concat(sFirst);
        System.out.println ("String with sLast + sMiddle + sFirst:");
        System.out.println(sLast + sMiddle + sFirst);
        System.out.println("String with func concat():");
        System.out.println(sResult);

        //System.out.println(sFirst);
        //System.out.println(sLast);
        //System.out.println(sMiddle);
    }
}
