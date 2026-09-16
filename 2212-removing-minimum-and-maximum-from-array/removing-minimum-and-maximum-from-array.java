class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n == 1) return 1;

        int mini = 0;
        int maxi = 0;

        
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[mini]) {
                mini = i;
            }
            if (nums[i] > nums[maxi]) {
                maxi = i;
            }
        }

        int l = Math.min(mini, maxi);
        int r = Math.max(mini, maxi);

        
        int removestart = r + 1;

        
        int removeend = n - l;

        
        int removeboth = (l + 1) + (n - r);

        return Math.min(removestart, Math.min(removeend, removeboth));
    }
}