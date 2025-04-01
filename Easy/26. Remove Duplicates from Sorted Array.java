class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int n = nums.length;

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(nums[i] == nums[j]) {
                    for(int m=j; m<n-1; m++){
                        nums[m] = nums[m + 1];
                    }
                    n--;
                    j--;
                }
            }
            k++;
        }
        return k;
    }
}