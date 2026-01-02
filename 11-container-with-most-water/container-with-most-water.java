class Solution {
    public int maxArea(int[] height) {
         int left = 0; // pointer at the start
        int right = height.length - 1; // pointer at the end
        int maxArea = 0;
        
        while (left < right) {
            // Calculate the area between the lines at left and right
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = width * currentHeight;
            
            // Update the maximum area
            maxArea = Math.max(maxArea, currentArea);
            
            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }
}