package com.example.example2;

/*
reference: https://codingbat.com/prob/p199368

reference: http://www.javaproblems.com/2013/11/java-recursion-2-groupsum6-codingbat.html
 */

/*

Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index, such that the group sums to the given target? However, with the additional constraint that all 6's must be chosen. (No loops needed.)


groupSum6(0, [5, 6, 2], 8) → true
groupSum6(0, [5, 6, 2], 9) → false
groupSum6(0, [5, 6, 2], 7) → false

-------

Expected	Run
groupSum6(0, [5, 6, 2], 8) → true	true	OK
groupSum6(0, [5, 6, 2], 9) → false	false	OK
groupSum6(0, [5, 6, 2], 7) → false	false	OK
groupSum6(0, [1], 1) → true	true	OK
groupSum6(0, [9], 1) → false	false	OK
groupSum6(0, [], 0) → true	true	OK
groupSum6(0, [3, 2, 4, 6], 8) → true	true	OK
groupSum6(0, [6, 2, 4, 3], 8) → true	true	OK
groupSum6(0, [5, 2, 4, 6], 9) → false	false	OK
groupSum6(0, [6, 2, 4, 5], 9) → false	false	OK
groupSum6(0, [3, 2, 4, 6], 3) → false	false	OK
groupSum6(0, [1, 6, 2, 6, 4], 12) → true	true	OK
groupSum6(0, [1, 6, 2, 6, 4], 13) → true	true	OK
groupSum6(0, [1, 6, 2, 6, 4], 4) → false	false	OK
groupSum6(0, [1, 6, 2, 6, 4], 9) → false	false	OK
groupSum6(0, [1, 6, 2, 6, 5], 14) → true	true	OK
groupSum6(0, [1, 6, 2, 6, 5], 15) → true	true	OK
groupSum6(0, [1, 6, 2, 6, 5], 16) → false	false	OK
other tests
OK


 */
public class Example2 {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 6, 2};
        System.out.println(">... " + groupSum6(0, arr, 7));
    }

    public static boolean groupSum6(int start, int[] nums, int target) {
        if(start >= nums.length) return target == 0;

        // int temp = 0;
        // if(nums[start] == 6) {
        //   temp = target - 6;
        // } else {
        //   temp = target - nums[start];
        // }

        // boolean rec1 = groupSum6(start+1, nums, temp);

        //---

        // boolean rec1 = false;
        // if(nums[start] == 6) {
        //   rec1 = groupSum6(start+1, nums, target - nums[start] - 6);
        // } else {
        //   rec1 = groupSum6(start+1, nums, target - nums[start]);
        // }

        //---

        boolean rec1 = groupSum6(start+1, nums, target - nums[start]);

        boolean rec2 = (nums[start] != 6 && groupSum6(start+1, nums, target));

        return rec1 || rec2;
    }

}
