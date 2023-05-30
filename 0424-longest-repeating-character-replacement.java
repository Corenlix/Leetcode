// https://leetcode.com/problems/longest-repeating-character-replacement/

class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int[] counts = new int['Z' - 'A' + 1];
        int curMax = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            var newChar = s.charAt(right);
            counts[newChar - 'A']++;
            curMax = Math.max(counts[newChar - 'A'], curMax);
            if (right - left + 1 - curMax > k) {
                counts[s.charAt(left) - 'A']--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}