class Solution {
    public int strStr(String haystack, String needle) {
        int k = 0;
        int idx = -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                k++;
                idx = i;
                
                for (int j = 1; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) == needle.charAt(j)) {
                        k++;
                    } else {
                        k = 0;
                        idx = -1;
                        break;
                    }
                }
                
                if (k == needle.length()) {
                    return idx;
                }
            }
        }

        return -1;
    }
}