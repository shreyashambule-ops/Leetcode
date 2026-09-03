class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;

        //Edge case, if size of the array is 1 then the largest rectangle will be the only element
        if (n == 1) {
            return heights[0];
        }
        
        //Construct left: If left[i] = 2, then it means that the two elements directly to the left of the ith element have a height of at least heights[i]
        int[] left = new int[n];

        for (int i = 1; i < n; i++) {
            if (heights[i] == heights[i - 1]) {
                left[i] = 1 + left[i - 1];
            } else if (heights[i] < heights[i - 1]) {
                int j = i - 1 - left[i - 1] - 1;
                while (j >= 0 && heights[i] < heights[j]) {
                    j = j - left[j] - 1;
                }
                if (j < 0) {
                    left[i] = i;
                    continue;
                }
                if (heights[i] == heights[j]) {
                    left[i] = i - j + left[j];
                } else {
                    left[i] = i - j - 1;
                }
            }
        }

        //Construct right: If right[i] = 2, then it means that the two elements directly to the right of the ith element have a height of at least heights[i]
        int[] right = new int[n];

        for (int i = n - 2; i >= 0; i--) {
            if (heights[i] == heights[i + 1]) {
                right[i] = 1 + right[i + 1];
            } else if (heights[i] < heights[i + 1]) {
                int j = i + 1 + right[i + 1] + 1;
                while (j < n && heights[i] < heights[j]) {
                    j = j + right[j] + 1;
                }
                if (j >= n) {
                    right[i] = n - i - 1;
                    continue;
                }
                if (heights[i] == heights[j]) {
                    right[i] = j - i + right[j];
                } else {
                    right[i] = j - i - 1;
                }
            }
        }

        //Once left and right are constructed, then finding the largest rectangle at any index is simply the following equation:
        int max = heights[0] + (right[0] + left[0]) * heights[0];

        for (int i = 1; i < n; i++) {
            max = Math.max(max, heights[i] + (right[i] + left[i]) * heights[i]);
        }

        return max;
        
    }
}
      