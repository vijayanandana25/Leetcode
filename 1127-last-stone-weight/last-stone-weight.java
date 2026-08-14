class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> res = new PriorityQueue<>((a,b)->b-a);
        for(int n : stones){
            res.add(n);
        }
        while(res.size()>1){
            int lstone = res.remove();
            int l2stone = res.remove();
            int nstone = lstone-l2stone;
            if(nstone!=0){
                res.add(nstone);
            }
        }
        if(res.size()==0){
            return 0;
        }else{
            return res.remove();
        }
    }
}