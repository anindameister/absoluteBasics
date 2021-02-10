package com.anindamaulik;

import com.anindamaulik.memento.Editor;

public class Main {

    public static void main(String[] args) {

        System.out.println("the tax return amount to be given to govt for the year 2019 is "+getTax().calculateTax(350000));
        System.out.println("the tax return amount to be given to govt for the year 2020 is "+getTaxOther().calculateTax(350000));
        getSomeKindaUIControl(new TextBox());
        getSomeKindaUIControl(new CheckBox());

        Maulik(new Aninda());

        var allahabadBank=new BankAccount();
        allahabadBank.deposit(1000);
        allahabadBank.withdrawl(570);
        System.out.println("the current account balance is "+allahabadBank.getBalance());

        Editor editor=new Editor();
        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("m");

        editor.undo();

        editor.setTitle("Aninda Maulik is great");
        editor.setTitle("His greatness comes from understanding the basics of greatness");
        editor.setTitle("He would try to become greater than the greatest by starting to think in 1st principle");
        System.out.println(editor.getPreviousTitle());
        editor.undoTitle();

        editor.setOneWordTitle("aninda");
        editor.setOneWordTitle("maulik");
        editor.setOneWordTitle("GreatAnindaMaulik");

        editor.undoOneWordTitle();





    }

    static Taxcalculator getTax(){
        /*
        1. we have to create an object of class TaxCalculator2019, because that's not a static class
        2. our return type is Taxcalculator, and jog your subconscience and realise that your answer is given
         */
        return new TaxCalculator2019();
    }

    static Taxcalculator getTaxOther(){

        return new TaxCalculator2020();
    }

    static void getSomeKindaUIControl(UIControl uiControl){

        uiControl.draw();
    }

    static void Maulik(AsishKalpana ak){
        ak.Height();
    }


}
