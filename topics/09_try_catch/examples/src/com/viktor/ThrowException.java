package com.viktor;

public class ThrowException {

    private static int balance = 0;

    public static int putMoney(int number){
        balance += number;
        return balance;
    }

    public static int getMoney(int number) throws NegativeBalanceException {
        if(balance - number < 0){
            // ex
//            throw new IllegalStateException("Balance < 0");
            throw new NegativeBalanceException(balance);
        }
        balance -= number;
        return number;
    }


    public static void main(String[] args)  {
        System.out.println("Hello");
        System.out.println("World");

        System.out.println(putMoney(1000));
        try {
            System.out.println(getMoney(2000));
        }
        catch (NegativeBalanceException e)
        {
            System.out.println("OK");
        }
        catch (Exception e)
        {
            throw e;
        }
    }
}
