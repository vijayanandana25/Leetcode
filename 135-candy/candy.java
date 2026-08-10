class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] l = new int[n];
        int[] r = new int[n];
        Arrays.fill(l,1);
        Arrays.fill(r,1);

        for(int i=0;i<n-1;i++){
            if(ratings[i]<ratings[i+1]){
                l[i+1] = l[i]+1;
            }
        }

        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                r[i]=r[i+1]+1;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum += Math.max(r[i],l[i]);
        }

        return sum;
    }
}