class Solution {
    public int romanToInt(String s) {
        int current;
        int next;
        int ans=0;

        for(int i=0; i<s.length(); i++) {
            current = getValue(s.charAt(i));
            if (i < s.length() - 1) {
                next = getValue(s.charAt(i+1));
            } else {
                next = 0;
            }

            if(current<next){
                ans = ans-current;
            }else if(current>=next){
                ans = ans+current;
            }

        }

        return ans;
        
    }

    int getValue(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return 0;
    }
}