class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)-> Integer.compare(a[1],b[1]));
        int skip = 0;
        int end = pairs[0][1];
        for(int ind = 1;ind<pairs.length;ind++){
            if(pairs[ind][0]>end){
                end = pairs[ind][1];
                skip++;
            }
        }
        return skip+1;
        
    }
}