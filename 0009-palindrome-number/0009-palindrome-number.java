class Solution {
    public boolean isPalindrome(int x) {
        // If the number is negative or ends with 0 (and is not 0 itself), it's not a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reversed = 0;
        int original = x;

        // Reverse half of the number
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // If the number is a palindrome, the first half equals the reversed second half
        return x == reversed || x == reversed / 10;
    }
}
