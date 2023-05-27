// https://leetcode.com/problems/trapping-rain-water/

class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int water = 0;
        int curHeight = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (curHeight < height[left]) {
                    curHeight = height[left];
                } else {
                    water += curHeight - height[left];
                }
                left++;
            } else {
                if (curHeight < height[right]) {
                    curHeight = height[right];
                } else {
                    water += curHeight - height[right];
                }
                right--;
            }
        }

        return water;
    }
}