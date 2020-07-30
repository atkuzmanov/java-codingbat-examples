package com.example.example3;


/*
reference: https://stackoverflow.com/questions/4570037/java-substring-index-range/4570062

reference: https://codingbat.com/
 */

public class Example3 {
    public static void main(String[] args) {

        //String substring()

        String str = "1234567";

        System.out.println("str.substring(0, 1) = " + str.substring(0, 1));
        System.out.println("\nstr.length() = " + str.length());
        System.out.println("\n(str.length()-1) = " + (str.length()-1));
        System.out.println("\n str.substring(str.length()-1, str.length()) = " + str.substring(str.length()-1, str.length()));

//        for(int i = 0; i < str.length(); i++) {
//
//        }

        System.out.println("\n>>> str.substring(0, 2) = " + str.substring(0, 2));


    }
}



