class Solution {
    public int[] productExceptSelf(int[] nums) {

        int res[] = new int[nums.length];
        int prePro = 1;
        int sufPro = 1;

        int preArr[] = new int[nums.length];
        int sufArr[] = new int[nums.length];

        preArr[0]=1;
        sufArr[nums.length-1]=1;

        for(int i=1 ; i<nums.length; i++){
            prePro = prePro*nums[i-1];
            preArr[i] = prePro;

            sufPro = sufPro*nums[nums.length-i];
            sufArr[nums.length-i-1]=sufPro;
        }

        for(int i = 0 ; i<nums.length ; i++){
            res[i]=preArr[i]*sufArr[i];
        }
        return res;
        
    }
}  
