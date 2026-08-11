import java.util.Scanner;

class Solution {
    // The method must return 'int' (the count k), not 'int[]'
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k; // Return the count of elements not equal to val
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array and initialize 'nums'
        int n = sc.nextInt();
        int[] nums = new int[n];

        int val = sc.nextInt();
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int k = sol.removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.print("Modified Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}