class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length - 1;
        int right = len;
        int left = 0;
        int maxArea = len * Math.min(heights[left] , heights[right]);
        while (left < right) {
            if (heights[left] <= heights[right]) {
                left++;
            }
            else {
                right--;
            }
            len--;
            maxArea = Math.max(maxArea , len * Math.min(heights[left] , heights[right]));
        }
        return maxArea;
        
    }
}
