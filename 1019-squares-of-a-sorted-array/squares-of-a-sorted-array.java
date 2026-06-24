class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res= new int[n];
        
        int left =0;
        int right = n-1;
        int index = n-1;
        while(left<=right){
            int leftsq = nums[left]*nums[left];
            int rs = nums[right]*nums[right];
             if(leftsq > rs){
                res[index] = leftsq;
                left++;
             }else{
                res[index]=rs;
                right--;
             }
             index--;
        }
        
        return res;
    }
}