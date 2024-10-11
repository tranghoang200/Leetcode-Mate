class Solution {
    
    // TC: O(n)
    // SC: O(1)

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
        
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            while (left < right && !Character.isLetterOrDigit(leftChar)) {
                left++;
                leftChar = s.charAt(left);
            }

            while (left < right && !Character.isLetterOrDigit(rightChar)) {
                right--;
                rightChar = s.charAt(right);
            }

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
