package com.anindamaulik;

public class BankAccount {

    private float Balance=0;

    public float getBalance() {

        return Balance;
    }

    public void deposit(float amount){
        if(amount>0)
            Balance=Balance+amount;

    }

    public void withdrawl(float amount){
        if (amount>0)
            Balance=Balance-amount;


    }


}
