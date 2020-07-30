package com.example.example7;

/*
reference: https://codingbat.com/prob/p128270
 */


/*

Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.


front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]



Expected	Run
front11([1, 2, 3], [7, 9, 8]) → [1, 7]	[1, 7]	OK
front11([1], [2]) → [1, 2]	[1, 2]	OK
front11([1, 7], []) → [1]	[1]	OK
front11([], [2, 8]) → [2]	[2]	OK
front11([], []) → []	[]	OK
front11([3], [1, 4, 1, 9]) → [3, 1]	[3, 1]	OK
front11([1, 4, 1, 9], []) → [1]	[1]	OK
other tests
OK
 */

public class Example7 {

    public int[] front11(int[] a, int[] b) {
        int al = a.length;
        int bl = b.length;

        int[] result = new int[] {};

        int afront = 0;
        int bfront = 0;

        if(al > 0) {
            result = new int[1];
            result[0] = a[0];
        }

        if(bl > 0) {
            int temp = 0;
            if(result.length > 0) {
                temp = result[0];
                result = new int[2];
                result[0] = temp;
                result[1] = b[0];
            } else {
                result = new int[1];
                result[0] = b[0];
            }
        }

        return result;
    }

}
