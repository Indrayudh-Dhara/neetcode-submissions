class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1;
        int count = 0;
        for(int n : nums){    
            if(n==0){
                count++;
            }else{
                pro=pro*n;
            }
        }

        int[] arr = new int[nums.length];

        for(int i = 0 ;i<nums.length ; i++){
            if(nums[i]!=0){
                if(count==0){
                    arr[i]=pro/nums[i];
                }else{
                    arr[i]=0;
                }
                
            }else{
                if(count >1){
                    arr[i]=0;
                }else{
                    arr[i]=pro;
                }
            }
            
        }

        return arr;
    }
}  
