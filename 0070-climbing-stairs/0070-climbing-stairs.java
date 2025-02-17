class Solution {
    public int climbStairs(int n) {
        if (n <= 1) return 1; 

        int b = 1, a = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            b = a;
            a = c;
        }
        return a;
    }}