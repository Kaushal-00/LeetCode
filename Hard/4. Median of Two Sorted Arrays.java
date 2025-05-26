class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] nums3 = new int[m + n];
        int i = 0;

        for (int j = 0; j < m; j++) {
            nums3[i++] = nums1[j];
        }

        for (int j = 0; j < n; j++) {
            nums3[i++] = nums2[j];
        }

        Arrays.sort(nums3);
        int total = m + n;
        int idx = total / 2;

        if (total % 2 != 0) {
            return nums3[idx];
        } else {
            return (nums3[idx - 1] + nums3[idx]) / 2.0;
        }
    }
}
