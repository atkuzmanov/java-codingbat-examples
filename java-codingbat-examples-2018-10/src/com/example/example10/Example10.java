package com.example.example10;

/*
reference: https://codingbat.com/prob/p185204

reference: http://www.javaproblems.com/2013/11/java-recursion-2-splitarray-codingbat.html
 */

/*

Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)


splitArray([2, 2]) → true
splitArray([2, 3]) → false
splitArray([5, 2, 3]) → true

---

Expected	Run
splitArray([2, 2]) → true	true	OK
splitArray([2, 3]) → false	false	OK
splitArray([5, 2, 3]) → true	true	OK
splitArray([5, 2, 2]) → false	false	OK
splitArray([1, 1, 1, 1, 1, 1]) → true	true	OK
splitArray([1, 1, 1, 1, 1]) → false	false	OK
splitArray([]) → true	true	OK
splitArray([1]) → false	false	OK
splitArray([3, 5]) → false	false	OK
splitArray([5, 3, 2]) → true	true	OK
splitArray([2, 2, 10, 10, 1, 1]) → true	true	OK
splitArray([1, 2, 2, 10, 10, 1, 1]) → false	false	OK
splitArray([1, 2, 3, 10, 10, 1, 1]) → true	true	OK
other tests OK

---

Solution:
public boolean splitArray(int[] nums) {
  int index = 0;
  int sum1 = 0;
  int sum2 = 0;
  return recArray(nums, index, sum1, sum2);
}

private boolean recArray ( int[] nums, int index, int sum1, int sum2 ) {
  if ( index >= nums.length ) {
    return sum1 == sum2;
  }

  int value = nums[index];

  return (recArray(nums, index + 1, sum1 + value, sum2) ||
    recArray(nums, index + 1, sum1, sum2 + value));
}


 */
public class Example10 {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 2, 3};
        System.out.println(">._ " + splitArray(arr));
    }

    public static boolean splitArray(int[] nums) {

        int index = 0;
        int sum1 = 0;
        int sum2 = 0;

        return recArray(nums, index, sum1, sum2);
    }

    public static boolean recArray(int[] nums, int index, int sum1, int sum2) {
        if (index >= nums.length) return sum1 == sum2;

        int value = nums[index];

        return (recArray(nums, index + 1, sum1 + value, sum2) ||
                recArray(nums, index + 1, sum1, sum2 + value));
    }

}
