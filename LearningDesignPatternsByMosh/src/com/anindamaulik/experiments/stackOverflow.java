package com.anindamaulik.experiments;
//https://stackoverflow.com/questions/2255500/can-i-multiply-strings-in-java-to-repeat-sequences
public class stackOverflow {

    public static String repeat(int count, String with) {
        return new String(new char[count]).replace("\0", with);
    }

    public static String repeat(int count) {
        return repeat(count, " ");
    }

    public static void main(String[] args) {


        for (int n = 1; n < 6; n++) {
            System.out.println(repeat(n, "*"));
        }
    }
}
