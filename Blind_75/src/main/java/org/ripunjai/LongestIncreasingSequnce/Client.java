package org.ripunjai.LongestIncreasingSequnce;

public class Client {

    public static void main(String[] args) {
        LongestIncreasingSequence longestIncreasingSequence = new LongestIncreasingSequence();
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = longestIncreasingSequence.longestConsecutive(nums);
        System.out.println("The length of the longest consecutive sequence is: " + result);
    }
}
