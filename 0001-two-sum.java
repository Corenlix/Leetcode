// https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        var hashmap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            var get = hashmap.get(target - nums[i]);
            if (get != null)
                return new int [] {i, get};

            hashmap.put(nums[i], i);
        }

        return null;
    }
}