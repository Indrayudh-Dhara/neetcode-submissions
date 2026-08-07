class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0 ; i<nums.length; i++){
            int n = nums[i];
        
            if(!hs.containsKey(n)){
                hs.put(nums[i], i);
            }else{
                if(nums[i]+nums[hs.get(nums[i])]==target){
                    int arr[] = {hs.get(nums[i]), i};
                    Arrays.sort(arr);
                    return arr;
                }
            }
            
        }
        
        Arrays.sort(nums);
        int i = 0 ;
        int j = nums.length-1;

        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum==target){
                int arr[] = {hs.get(nums[i]), hs.get(nums[j])};
                Arrays.sort(arr);
                return arr;
            }else if(sum>target){
                j--;
            }else{
                i++;
            }
        }
        return null;
    }
}
