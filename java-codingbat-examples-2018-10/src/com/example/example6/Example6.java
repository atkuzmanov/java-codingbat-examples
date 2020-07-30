package com.example.example6;

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

public class Example6 {
    public static void main(String[] args) {
        System.out.println("" + withoutX2(""));
    }

    public static String withoutX2(String str) {
        int l = 2;
        if(str.length() < 2) l = str.length();
        if(str.equals("")) return "";
        String result = "";



        int i = 0;

        for(i=0; i< l; i ++) {
            if(str.charAt(i) == 'x') {
                if(i < (str.length()-2) && str.charAt(i+1) == 'x') {
                    result = result + str.charAt(i+2);
                    i+=2;
                } else if( i < (str.length()-2)) {
                    result = result + str.charAt(i+1);
                    i+=1;
                }
            } else {
                result = result + str.charAt(i);
            }

        }



        if(i < str.length()) result += str.substring(i);

        return result;
    }


}
