package com.viktor;

public class NegativeBalanceException extends Exception {

    public NegativeBalanceException(int currentBalance) {
        super("Your balance is not enough to take money! Your balance is " + currentBalance);
    }
}
