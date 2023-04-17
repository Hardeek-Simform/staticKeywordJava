package com.staticKeyword.bank;

public class AccountBalance {
    public static int accountBalance = 10000;

    static {
        System.out.print("Welcome Hardeek, \nyour current account balance is : ");
    }

    public static void withdrawBalance(int withdrawAmt) {
        accountBalance = accountBalance - withdrawAmt;
        System.out.println("After your withdrawal your remaining balance is : " + accountBalance);
    }
}
