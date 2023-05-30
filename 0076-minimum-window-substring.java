// https://leetcode.com/problems/minimum-window-substring/

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int left = 0;
        int right = 0;
        
        var sCounts = new int['z' - 'A' + 1];
        var tCounts = new int['z' - 'A' + 1];

        int minLength = Integer.MAX_VALUE;
        int substr = 0;

        for (int i = 0; i < t.length(); i++) {
            tCounts[t.charAt(i) - 'A']++;
        }

        while (left < s.length() - t.length() + 1) {
            boolean containsT = true;
            for (int i = 0; i < sCounts.length; i++) {
                if (sCounts[i] < tCounts[i]) {
                    containsT = false;
                    break;
                }
            }

            if (containsT) {
                int len = right - left + 1;
                if (minLength > len) {
                    minLength = len;
                    substr = left;
                }
                sCounts[s.charAt(left) - 'A']--;
                left++;
            } else if (right < s.length()) {
                sCounts[s.charAt(right) - 'A']++;
                right++;
            } else {
                break;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(substr, substr + minLength - 1);
    }
}