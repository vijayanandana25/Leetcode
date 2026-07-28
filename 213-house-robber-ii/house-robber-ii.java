class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        return Math.max(roblinear(nums,0,n-2),roblinear(nums,1,n-1));

    }

    public int roblinear(int[] nums, int start, int end){
        int n = end-start+1;
        if(start==end) return nums[start];
        //we use memoization instead of tabulation here becoz of space complexity
        int prev2 =nums[start];
        int prev1 =Math.max(nums[start],nums[start+1]);
        for(int i=start+2;i<=end;i++){
            int curr=Math.max(nums[i]+prev2,prev1);
            prev2 =  prev1;
            prev1=curr;
        }
        return prev1;
    }
}