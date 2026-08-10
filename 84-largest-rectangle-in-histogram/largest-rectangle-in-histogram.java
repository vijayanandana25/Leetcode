class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<=heights.length;i++){
            int h = i==heights.length?0:heights[i];
            while(!st.isEmpty() && h<heights[st.peek()]){
                int he = heights[st.pop()];
                int wd = st.isEmpty()?i:i-st.peek()-1;
                max = Math.max(max,he*wd);
            }
            st.push(i);
        }
        return max;
    }
}