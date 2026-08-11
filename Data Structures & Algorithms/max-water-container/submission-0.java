class Solution {
    public int maxArea(int[] heights) {
        int totalWater = 0;
        int i = 0 ;
        int j = heights.length-1;

        while(i<j){
            int water = (j-i)*Math.min(heights[i] , heights[j]);
            totalWater = Math.max(totalWater, water);

            if(heights[i]>heights[j]){
                j--;
            }else{
                i++;
            }
        }
        return totalWater;
    }
}
