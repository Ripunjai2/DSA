package org.ripunjai.TwoSum;

import java.util.HashMap;

class TwoSum {
    public int[] solve(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                if(i!= map.get(target-nums[i]))
                    return new int[]{i, map.get(target-nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
