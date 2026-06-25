class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int cs = 0;
        int tot = 0;
        for(int num : nums){
            cs+=num;
            if(map.containsKey(cs-k)) tot +=map.get(cs-k);

            map.put(cs,map.getOrDefault(cs,0)+1);
        }
        return tot;
    }
}