class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        // Expected sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;
        
        // Calculate actual sum of array elements
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        // Missing number is the difference
        return expectedSum - actualSum;
    }
}