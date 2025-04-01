class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        for(int i=0; i<s.length(); i++){
            top++;
            stack[top] = s.charAt(i);
            if(top>0) {
                if ((stack[top] == ')' && stack[top-1]== '(') || 
                    (stack[top] == '}' && stack[top-1]== '{') || 
                    (stack[top] == ']' && stack[top-1]== '[')) {
                        top = top-2;
                }
            }
        }

        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
}