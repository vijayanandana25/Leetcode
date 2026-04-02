class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] arr = new boolean[nums.length+1];
        for(int i:nums){
            arr[i]=true;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
           if(!arr[i]) res.add(i);
        }
        return res;
    }
}