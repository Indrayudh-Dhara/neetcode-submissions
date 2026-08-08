class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int finalCount = 1;
        if(nums.length==0 || nums.length==1){
            return nums.length;
        }
        for(int i = 0 ; i<nums.length-1; i++){
        
            if(nums[i+1]==nums[i]+1){
                count++;
            }else if(nums[i+1]==nums[i]){
                continue;
            }
            else{
               count = 1;
            }
            finalCount = Math.max(finalCount , count);
        }

        return finalCount;
    }
}
