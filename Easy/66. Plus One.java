class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        digits[n-1] = digits[n-1] + 1;

        if(digits[n-1] != 10){
            return digits;
        }else{
            for(int i = n-1; i >= 1; i--) {
                if(digits[i] == 10){
                    digits[i] = 0;
                    digits[i-1] = digits[i-1] + 1;
                }
            }

            if(digits[0] != 10){
                return digits;
            }else{
                int[] digits2 = new int[n+1];
                digits2[0] = 1;
                digits2[1] = 0;

                for(int i = 2; i<=n; i++) {
                    digits2[i] = digits[i-1];
                }

                return digits2;
            }
        }
    }
}