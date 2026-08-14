class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n==0) return 0;
        int[] p=new int[n];
        int[] s = new int[n];
        p[0]=height[0];
        for(int i=1;i<n;i++){
            p[i]=Math.max(height[i],p[i-1]);
        }
        s[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            s[i]=Math.max(s[i+1],height[i]);
        }
        int w=0;
        for(int i=0;i<n;i++){
            w+=Math.min(p[i],s[i])-height[i];
        }
        return w;

    }
}