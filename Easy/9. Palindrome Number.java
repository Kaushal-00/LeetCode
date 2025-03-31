class Solution {

    boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        } else if(x==0){
            return true;
        }

        int num = x;
        int reverse=0;
        int digit;
        
        while(x!=0)
        {
            digit=x%10;
            x=x/10;
            reverse=reverse*10+digit;
        }

        if(num==reverse) {
            return true;
        }else{
            return false;
        }

    }
}