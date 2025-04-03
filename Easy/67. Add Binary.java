class Solution {
    public String addBinary(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        int carry = 0;
        String result = "";

        for(int i = 0; i < Math.max(lengthA, lengthB); i++) {
            int bitA = 0;
            int bitB = 0;

            if(lengthA - 1 - i >= 0) {
                bitA = a.charAt(lengthA - 1 - i) - '0';
            }

            if(lengthB - 1 - i >= 0) {
                bitB = b.charAt(lengthB - 1 - i) - '0';
            }

            int sum = bitA + bitB + carry;
            int resultBit = sum % 2;
            carry = sum / 2;

            result = resultBit + result;
        }

        if(carry > 0) {
            result = '1' + result;
        }

        return result;
    }
}