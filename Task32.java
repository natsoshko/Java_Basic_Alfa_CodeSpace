package com.alpha.work32;


import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        System.out.print("Enter deposit: ");
        Scanner sc = new Scanner(System.in);
        double deposit = sc.nextDouble();
        double dBuf = deposit;
        double dpercent = 12;

        System.out.print("Enter the month: ");
        int iMon = sc.nextInt();
        double dResMon =(deposit * dpercent * iMon / 12) / 100;
        System.out.println("Profit in " + iMon + " months = " + dResMon);
        System.out.println("Final sum in " + iMon + " months = " + (deposit + dResMon));

        // Profit in 5 years
        System.out.println("--------------------------------");
        System.out.println("Profit and Final sum in 5 years:");
        int years = 5;
        double prybutok = Math.ceil((deposit*dpercent/100)*100)/100;
        dBuf = deposit;
        deposit += prybutok;
        System.out.println("1 year:" + "   Initial sum = " + dBuf + "   Profit = " + prybutok + "   Final sum = " + deposit);
        prybutok = Math.ceil((deposit*dpercent/100)*100)/100;
        dBuf = deposit;
        deposit += prybutok;
        System.out.println("2 year:" + "   Initial sum = " + dBuf + "   Profit = " + prybutok + "   Final sum = " + deposit);
        prybutok = Math.ceil((deposit*dpercent/100)*100)/100;
        dBuf = deposit;
        deposit += prybutok;
        System.out.println("3 year:" + "   Initial sum = " + dBuf + "   Profit = " + prybutok + "   Final sum = " + deposit);
        prybutok = Math.ceil((deposit*dpercent/100)*100)/100;
        dBuf = deposit;
        deposit += prybutok;
        System.out.println("4 year:" + "   Initial sum = " + dBuf + "   Profit = " + prybutok + "   Final sum = " + deposit);
        prybutok = Math.ceil((deposit*dpercent/100)*100)/100;
        dBuf = deposit;
        deposit += prybutok;
        System.out.println("5 year:" + "   Initial sum = " + dBuf + "   Profit = " + prybutok + "   Final sum = " + deposit);
    }
}
