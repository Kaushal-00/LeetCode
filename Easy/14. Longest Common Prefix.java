class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        String s1 = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String s2 = strs[i];
            StringBuilder tempPrefix = new StringBuilder();
            
            for (int k = 0; k < Math.min(s1.length(), s2.length()); k++) {
                if (s1.charAt(k) == s2.charAt(k)) {
                    tempPrefix.append(s1.charAt(k));
                } else {
                    break;
                }
            }

            s1 = tempPrefix.toString();
            if (s1.isEmpty()) {
                return "";
            }
        }
        return s1;
    }
}



// Another Solution:
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
