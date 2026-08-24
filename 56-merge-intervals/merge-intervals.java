class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> res = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        res.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] curr = intervals[i];
            int[] prev = res.get(res.size()-1);

            if(prev[1]>=curr[0]){
                prev[1]=Math.max(prev[1],curr[1]);
            }else{
                res.add(curr);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}