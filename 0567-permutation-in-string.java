// https://leetcode.com/problems/permutation-in-string/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() < s2.length())
            return false;

        var counts1 = new int['z' - 'a' + 1];
        var counts2 = new int['z' - 'a' + 1];

        for (int i = 0; i < s1.length(); i++) {
            counts1['z' - s1.charAt(i)]++;
            counts2['z' - s2.charAt(i)]++;
        }

        if(Arrays.equals(counts1, counts2)) {
            return true;
        }

        for (int i = 0; i < s2.length() - s1.length(); i++) {
            counts2['z' - s2.charAt(i)]--;
            counts2['z' - s2.charAt(i + s1.length())]++;
            if(Arrays.equals(counts1, counts2)) {
                return true;
            }
        }

        return false;
    }
}