package com.mfr.dsa.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-988,-868,-825,-815,-772,-769,-747,-710,-684,-660,-656,-644,-627,-602,-579,-549,-540,-536,-482,-477,-405,-350,-344,-293,-283,-280,-274,-249,-203,-198,-162,-162,-124,-103,-103,-79,-61,-40,-4,34,35,86,151,198,203,218,313,332,339,339,356,370,374,406,435,441,450,450,471,529,555,558,590,638,640,648,670,685,716,719,722,763,803,820,852,854,906,932,961,978,988};
        System.out.println("length: " + nums.length);
        List<List<Integer>> result = threeSum(nums);
        System.out.println("Ans:" + result);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3)
            return result;

        Arrays.sort(nums);

        List<Integer> triplet = new ArrayList<>();
        for (int index = 0; index < nums.length - 2; ++index) {
            int start = index + 1, end =  nums.length - 1;

            while (start < end) {
                while ((start < end) && (start != 1) && (nums[start-1] == nums[start])) {
                    System.out.println("start:" + start + " nums[start]:" + nums[start]);
                    ++start;
                }

                while (end < nums.length - 1 && nums[end + 1] == nums[end]) {
                    System.out.println("end:" + end + " nums[end]:" + nums[end]);
                    --end;
                }

                int sum = nums[index] + nums[start] + nums[end];
                System.out.println("index:" + index + " nums[index]:" + nums[index] + " Sum:" + sum);
                if (sum == 0) {
                    triplet = new ArrayList<>();
                    triplet.add(nums[index]);
                    triplet.add(nums[start]);
                    triplet.add(nums[end]);

                    result.add(triplet);
                    ++start;
                    --end;
                }

                if (sum < 0) {
                    ++start;
                } else {
                    --end;
                }
            }
        }
        // Replace this placeholder return statement with your code
        return result;
    }
}
