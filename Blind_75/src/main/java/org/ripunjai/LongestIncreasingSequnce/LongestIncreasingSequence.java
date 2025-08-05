package org.ripunjai.LongestIncreasingSequnce;

import java.util.HashSet;

public class LongestIncreasingSequence {
        public int longestConsecutive(int[] nums) {
            int temp =0;
            int max = 0;

            HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<nums.length;i++){
                set.add(nums[i]);
            }

            for(int num : set){
        //  for(int num: nums){
       //   if we iterate over hashset, we won't be able to remove elements from set avoiding re-computation for the same integer
       //   but if we iterate over the original array, we can remove elements from the set
                if(!set.contains(num-1)){
                    int currentNum = num;
                    temp = 0;
                    while(set.contains(currentNum)){
                        temp++;
                        // set.remove(currentNum);
                        currentNum++;
                    }
                    max = Math.max(max, temp);
                }
            }
            return max;
        }
}
