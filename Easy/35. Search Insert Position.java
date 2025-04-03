class Solution {
    public int searchInsert(int[] nums, int target) {
        int idx = -1;

        for(int i = 0; i < nums.length; i++){
            idx++;
            if(nums[idx] == target){
                return idx;
            }
        }

        if(idx == nums.length - 1) {
            if(target > nums[nums.length - 1]){
                return nums.length;
            } else {
                for(int i = 0; i < nums.length - 1; i++){
                    if(nums[i] < target && nums[i + 1] > target) {
                        return i+1;
                    }
                }
            }
        }

        return 0;
    }
}