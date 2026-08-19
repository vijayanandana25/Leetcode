class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        return Math.max(roblinear(0, n - 2, nums), roblinear(1, n - 1, nums));
    }

    private static int roblinear(int start, int end, int[] nums) {
        if (start > end) return 0;
        if (start == end) return nums[start];

        int prev2 = nums[start];
        int prev1 = Math.max(nums[start], nums[start + 1]);

        for (int i = start + 2; i <= end; i++) {
            int curr = Math.max(prev2 + nums[i], prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}