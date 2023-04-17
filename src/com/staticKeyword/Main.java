package com.staticKeyword;

import com.staticKeyword.bank.AccountBalance;

public class Main {
    public static void main(String[] args) {
        System.out.println(AccountBalance.accountBalance);
        AccountBalance.withdrawBalance(1000);
    }
}