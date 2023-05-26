// https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {
        var set = new HashSet<Integer>(nums.length);
        for (int num : nums) set.add(num);

        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i]))
                continue;
            int length = 1;
            int curNumber = nums[i];
            set.remove(nums[i]);

            while (set.contains(curNumber + 1)) {
                curNumber++;
                length++;
                set.remove(curNumber);
            }

            curNumber = nums[i];
            while (set.contains(curNumber - 1)) {
                curNumber--;
                length++;
                set.remove(curNumber);
            }

            if (length > maxLength) {
                maxLength = length;
            }
        }


        return maxLength;
    }
}