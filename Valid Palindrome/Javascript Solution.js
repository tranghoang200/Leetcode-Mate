// TC: O(n)
// SC: O(1)

var isPalindrome = function(s) {
    let left = 0, right = s.length - 1;
    s = s.toLowerCase();
    
    while (left < right) {
        let leftChar = s[left];
        let rightChar = s[right];

        while (left < right && !/^[a-z0-9]+$/i.test(leftChar)) {
            left++;
            leftChar = s[left];
        }

        while (left < right && !/^[a-z0-9]+$/i.test(rightChar)) {
            right--;
            rightChar = s[right];
        }

        if (leftChar !== rightChar) {
            return false;
        }

        left++;
        right--;
    }
    
    return true;
};
