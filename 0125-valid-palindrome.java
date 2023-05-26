// https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            var leftChar = Character.toLowerCase(s.charAt(left));
            if(!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }

            var rightChar = Character.toLowerCase(s.charAt(right));
              if(!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            if(leftChar != rightChar)
                return false;

            left++;
            right--;
        }
        return true;
    }
}