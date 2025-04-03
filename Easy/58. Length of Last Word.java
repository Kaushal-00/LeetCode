class Solution {
    public int lengthOfLastWord(String s) {
        int stIdx = -1;
        int lstIdx = -1;

        for(int i = s.length() - 1; i>= 0; i--) {
            if(s.charAt(i) != ' ') {
                lstIdx = i;
                break;
            }
        }

        for(int i = lstIdx; i>= 0; i--) {
            if(s.charAt(i) == ' ') {
                stIdx = i+1;
                break;
            }
        }

        if (stIdx == -1) {
            stIdx = 0;
        }
        return lstIdx - stIdx + 1;
    }
}