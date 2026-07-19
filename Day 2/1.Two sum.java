class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Look at every number
        for (int i = 0; i < nums.length; i++) {
            // Look at every number after it
            for (int j = i + 1; j < nums.length; j++) {
                // If they add up to the target, return their positions
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}
