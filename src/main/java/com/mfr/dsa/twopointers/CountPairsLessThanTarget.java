package com.mfr.dsa.twopointers;

import  java.util.List;
import  java.util.ArrayList;

//https://www.educative.io/courses/grokking-coding-interview/count-pairs-whose-sum-is-less-than-target
//Count Pairs Whose Sum is Less than Target

/**
 * Statement#
 *
 * You are given a 0-indexed integer array, nums, of length nn, and an integer target. Your task is to determine the number of distinct pairs of indexes (i,j)(i,j) such that:
 *
 *     0≤i<j<n0≤i<j<n (i.e., ii comes before jj in the array)
 *
 *     The sum of the elements of the indexes (i,j)(i,j), (i.e., nums[i]+nums[j]nums[i]+nums[j]), is strictly less than the target.
 *
 * Constraints:
 *
 *     n=n= nums.length
 *
 *     1≤n≤501≤n≤50
 *
 *     −50≤−50≤ nums[i], target ≤50≤50
 */

public class CountPairsLessThanTarget {

    public static int countPairs (List<Integer> nums, int target) {
        int i = 0, j =1;
        int size = nums.size();
        int result = 0;
        for (int index = 0; index < size-1; ++index) {
            i = index;
            j = index + 1;
            while (j < size) {
                if (nums.get(i) + nums.get(j) < target) {
                    ++result;
                }
                ++j;
            }
        }
        return result;
    }

}
