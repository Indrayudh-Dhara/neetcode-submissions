class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hs = new HashMap<>();
        int result[] = new int[2];
        
        for(int i = 0 ; i<nums.length ;i++){
            if(!hs.containsKey(target - nums[i])){
                hs.put(nums[i], i);
            }else{
                result[0]=hs.get(target-nums[i]);
                result[1]=i;
            }
        }
        return result;
        
    }
}
