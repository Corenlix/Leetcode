// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int leftValue = numbers[left];
            int rightValue = numbers[right];
            int needValue = target - leftValue;

            if (needValue == rightValue) {
                return new int[] {left + 1, right + 1};
            } else if(needValue < rightValue) {
                right--;
            } else {
                left++;
            }
        }

        return null;
    }
}