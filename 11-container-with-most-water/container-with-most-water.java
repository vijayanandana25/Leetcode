class Solution {
    public int maxArea(int[] h) {
        int n=h.length;
        int maxarea=0;
        int left=0;
        int right=n-1;
        while(left<right){
            int currentheight = Math.min(h[left],h[right]);
            int currentwidth = right-left;
            int area = currentheight*currentwidth;
            maxarea = Math.max(area,maxarea);

            if(h[left]<h[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}