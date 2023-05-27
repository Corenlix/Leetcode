// https://leetcode.com/problems/longest-substring-without-repeating-characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        var usedChars = new HashSet<Character>();
        
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            var curChar = s.charAt(right);

            if (usedChars.contains(curChar)) {
                while (s.charAt(left) != curChar) {
                    usedChars.remove(s.charAt(left));
                    left++;
                }
                left++;
            }

            maxLength = Math.max(maxLength,  right - left + 1);

            usedChars.add(curChar);
        }

        return maxLength;
    }
}