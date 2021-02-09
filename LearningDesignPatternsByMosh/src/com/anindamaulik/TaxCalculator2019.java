package com.anindamaulik;

public class TaxCalculator2019 implements Taxcalculator{
    @Override
    public float calculateTax(float income) {
        float tax = 0;
        if(income>0 && income<250000){
            return tax;


        }else if (income>250001 && income<500000){
            tax= (float) (income*0.05);
            return tax;
        }else if (income>500001 && income<1000000) {
            tax = (float) (income * 0.2);
            return tax;
        }else if (income>1000001 && income<10000000) {
            tax = (float) (income * 0.3);
            return tax;
        }

        return tax;
    }
}
