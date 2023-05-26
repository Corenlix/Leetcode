// https://leetcode.com/problems/intersection-of-two-arrays-ii/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        var intersectNumbers = new ArrayList<Integer>(Math.min(nums1.length, nums2.length));
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                intersectNumbers.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }

        var resultArray = new int[intersectNumbers.size()];
        for (i = 0; i < resultArray.length; i++) {
            resultArray[i] = intersectNumbers.get(i);
        }
        return resultArray;
    }
}