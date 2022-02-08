package com.benbank.bank_app;

public class BankApp {

    public static void main(String[] args) {
        BankAccount customerAcct = new BankAccount(2000, 450);
        //System.out.println(customerAcct.getCheckingBalance());
        //System.out.println(customerAcct.getSavingsBalance());
        //customerAcct.checkingWithdrawal(200);
        //customerAcct.savingsWithdrawal(70);

        //System.out.println(customerAcct.getCheckingBalance());
        //System.out.println(customerAcct.getSavingsBalance());
        customerAcct.transferToChecking(60);
        customerAcct.transferToSavings(260);
        //customerAcct.depositToChecking(500); // 2500
        //customerAcct.depositToSavings(550); // 1000


    }
}
