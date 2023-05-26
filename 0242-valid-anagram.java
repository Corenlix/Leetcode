// https://leetcode.com/problems/valid-anagram/

class Solution {
    public boolean isAnagram(String s, String t) {
        var rCounts = new int[26];
        var rArr = s.toCharArray();

        for (var c : rArr) {
            rCounts[c - 97]++;
        }

        var mCounts = new int[26];
        var mArr = t.toCharArray();

        for (var c : mArr) {
            mCounts[c - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            if (rCounts[i] != mCounts[i]) {
                return false;
            }
        }

        return true;
    }
}