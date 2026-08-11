class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> al = new ArrayList<>();
        
        for(int i = 0 ;i<nums.length ; i++){
            int j=i+1;
            int k = nums.length-1;
            if(i!=0){
                if(nums[i]==nums[i-1]){
                    continue;
                }
            }
            while(j<k ){
                if(nums[j]+nums[k]+nums[i]==0){   
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[j]);
                    list.add(nums[k]);
                    list.add(nums[i]);
                    al.add(list);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }else if(nums[j]+nums[k]+nums[i]>0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return al;       
    }
}
