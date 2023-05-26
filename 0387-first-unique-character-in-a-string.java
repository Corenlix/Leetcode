// https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {
        var arr = new int[26];
        var sArr = s.toCharArray();

        for (var c : sArr) {
            if (c >= 'a' && c <= 'z') {
                arr[c - 'a']++;
            }
        }

        for (int i = 0; i < sArr.length; i++) {
            if (arr[sArr[i] - 'a'] == 1)
                return i;
        }

        return -1;
    }

}