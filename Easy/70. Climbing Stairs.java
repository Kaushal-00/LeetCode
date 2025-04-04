class Solution {
    public int climbStairs(int n) {
        if(n == 0) {
            return n;
        } else if(n == 1) {
            return n;
        } else if(n == 2) {
            return n;
        } else {
            int f1 = 1;
            int f2 = 2;

            for(int i=3; i<=n; i++) {
                int current = f2 + f1;
                f1 = f2;
                f2 = current;
            }
            return f2;
        }
    }
}