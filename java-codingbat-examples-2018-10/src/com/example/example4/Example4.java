package com.example.example4;

/*
reference: https://codingbat.com/
 */

/*

reference: https://codingbat.com/prob/p165701

We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.


loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false



Expected	Run
loneTeen(13, 99) → true	true	OK
loneTeen(21, 19) → true	true	OK
loneTeen(13, 13) → false	false	OK
loneTeen(14, 20) → true	true	OK
loneTeen(20, 15) → true	true	OK
loneTeen(16, 17) → false	false	OK
loneTeen(16, 9) → true	true	OK
loneTeen(16, 18) → false	false	OK
loneTeen(13, 19) → false	false	OK
loneTeen(13, 20) → true	true	OK
loneTeen(6, 18) → true	true	OK
loneTeen(99, 13) → true	true	OK
loneTeen(99, 99) → false	false	OK


 */

public class Example4 {
    public static void main(String[] args) {
        System.out.println("\nloneTeen: " + loneTeen(19, 25));





    }


    public static boolean loneTeen(int a, int b) {
        boolean isATeen = (a >= 13 && a <= 19);
        boolean isBTeen = (b >=13 && b <= 19);

        System.out.println("isATeen: " + isATeen);
        System.out.println("isBTeen: " + isBTeen);

        return (isATeen || isBTeen) && !(isATeen && isBTeen);
    }


    public static boolean loneTeenSolution(int a, int b) {
        // Store teen-ness in boolean local vars first. Boolean local
        // vars like this are a little rare, but here they work great.
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
        // Translation: one or the other, but not both.
        // Alternately could use the Java xor operator, but it's obscure.
    }


}




