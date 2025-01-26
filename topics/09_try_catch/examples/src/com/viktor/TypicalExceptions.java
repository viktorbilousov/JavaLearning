package com.viktor;

public class TypicalExceptions {

    public static int triggerNullpointer(){
        String text = null;
       return text.length();  // NullpointerException
    }

    public static int getLength(String string){
        if(string == null) throw new NullPointerException("String is null!");
        return string.length();
    }

    public static int calcPerimeterOfSqare(int side){
        if(side <= 0){
            throw new IllegalArgumentException("side <= 0");
        }
        return side*4;
    }

    public static int getBalance(int amount){
         int currentBalance = 1000;
         if(amount > currentBalance){
             throw new IllegalStateException("Amount > current balance");
         }
         return currentBalance - amount;
    }

    public static void main(String[] args) {
    }
}
