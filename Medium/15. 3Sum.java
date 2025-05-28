class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));


                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }


                    left++;
                    right--;
                } else if (sum < 0) {

                    left++;
                } else {

                    right--;
                }
            }
        }
        return result;
    }
}




class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < nums.length - 2; i++) {
            int x = nums[i];

            for(int j = i+1; j < nums.length - 1; j++) {
                int y = nums[j];

                for(int k = j+1; k < nums.length; k++) {
                    int z = nums[k];

                    if(x + y + z == 0) {
                        ArrayList<Integer> list1 = new ArrayList<>();
                        list1.add(x);
                        list1.add(y);
                        list1.add(z);

                        Collections.sort(list1);    
                        
                        if(!list.contains(list1)) {
                            list.add(list1);
                        }
                    }
                }
            }
        }
        return list;
    }
}