class Solution {
    public int[] shuffle(int[] nums, int n) {
        // Create a new result array of size 2n
        int[] result = new int[2 * n];
        
        // Use an index to track where we place elements in the result array
        int index = 0;
        
        // Loop through the first half of the array
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];     // Append x_i
            result[index++] = nums[i + n]; // Append y_i
        }
        
        return result;
    }
}
