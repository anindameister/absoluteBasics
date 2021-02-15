package com.anindamaulik.argumentation;

import java.util.HashSet;
import java.util.LinkedList;

public class arguments {

    private static char a='a';
    private static char b='b';
    private static char c='c';
    private static char d='d';
    private static char e='e';

    public static char getA() {
        return a;
    }

    public static void setA(char a) {
        arguments.a = a;
    }

    public static char getB() {
        return b;
    }

    public static void setB(char b) {
        arguments.b = b;
    }

    public static char getC() {
        return c;
    }

    public static void setC(char c) {
        arguments.c = c;
    }

    public static char getD() {
        return d;
    }

    public static void setD(char d) {
        arguments.d = d;
    }

    public static char getE() {
        return e;
    }

    public static void setE(char e) {
        arguments.e = e;
    }

    public static HashSet<LinkedList<Character>> given() {

        HashSet<LinkedList<Character>> R = new HashSet<LinkedList<Character>>();

        LinkedList<Character> couple1 = new LinkedList<Character>();
        LinkedList<Character> couple2 = new LinkedList<Character>();
        LinkedList<Character> couple3 = new LinkedList<Character>();
        LinkedList<Character> couple4 = new LinkedList<Character>();
        LinkedList<Character> couple5 = new LinkedList<Character>();
        LinkedList<Character> couple6 = new LinkedList<Character>();
        couple1.add(getA());
        couple1.add(getB());

                /*
        R = {(a; b); (c; b); (c; d); (d; c); (d; e); (e; e)}
         */

        couple2.add(getC());
        couple2.add(getB());

        couple3.add(getC());
        couple3.add(getD());

        couple4.add(getD());
        couple4.add(getC());

        couple5.add(getD());
        couple5.add(getE());

        couple6.add(getE());
        couple6.add(getE());

        R.add(couple1);
        R.add(couple2);
        R.add(couple3);
        R.add(couple4);
        R.add(couple5);
        R.add(couple6);


        return R;

    }
}
