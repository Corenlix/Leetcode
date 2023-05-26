// https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxS = 0;

        while (left < right) {
            int s = (Math.min(height[right], height[left])) * (right - left);
            if (s > maxS)
                maxS = s;

            if (height[left] > height[right])
                right--;
            else left++;
        }

        return maxS;
    }
}