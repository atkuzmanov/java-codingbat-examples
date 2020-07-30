package com.example.example5;

/*
reference: https://codingbat.com/prob/p151359
 */

/*

Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"


Expected	Run
withoutX2("xHi") → "Hi"	"Hi"	OK
withoutX2("Hxi") → "Hi"	"Hi"	OK
withoutX2("Hi") → "Hi"	"Hi"	OK
withoutX2("xxHi") → "Hi"	"Hi"	OK
withoutX2("Hix") → "Hix"	"Hix"	OK
withoutX2("xaxb") → "axb"	"axb"	OK
withoutX2("xx") → ""	""	OK
withoutX2("x") → ""	""	OK
withoutX2("") → ""	""	OK
withoutX2("Hello") → "Hello"	"Hello"	OK
withoutX2("Hexllo") → "Hexllo"	"Hexllo"	OK
withoutX2("xHxllo") → "Hxllo"	"Hxllo"	OK
other tests
OK

 */

public class Example5 {
    public static void main(String[] args) {
        System.out.println(withoutX2("xHi"));
    }

    public static String withoutX2(String str) {
        int l = str.length();

        String result = "";
        for(int i = 0; i < l-1; i++) {
            if(str.substring(i, i+1).equals("x")) {
                if(i+2 < l && str.substring(i+1, i+2).equals("x")) {
                    result = result + str.substring(i+1, i+2);
                }
                result = result + str.substring(i+1, i+1);
            }
        }
        return result;
    }

}
