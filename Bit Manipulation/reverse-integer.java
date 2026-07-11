class Solution {
    public int reverse(int x) {
        // For arrays, I use indices.

        // For strings, I use charAt().

        // For integers, I remember two operations:% 10     / 10
        
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            // Check for overflow
            // Integer.MAX_VALUE = 2147483647

            if (reversed > Integer.MAX_VALUE / 10 ||
                    (reversed == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;

            // Check for underflow
            // Integer.MIN_VALUE = -2147483648
            if (reversed < Integer.MIN_VALUE / 10 ||
                    (reversed == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;
            reversed = reversed * 10 + digit;

        }
        return reversed;

    }
}
