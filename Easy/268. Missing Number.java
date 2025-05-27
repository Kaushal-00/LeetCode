class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        for (int i = 0; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (i == nums[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }

        return -1;
    }
}


class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return total - sum;
    }
}
