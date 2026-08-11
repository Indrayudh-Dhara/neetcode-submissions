class Solution {
    public int trap(int[] height) {
        int totalWater = 0;
        int leftExtreme[] = new int[height.length];
        int rightExtreme[] = new int[height.length];

        for(int i = 0 ; i<height.length ; i++){
            if(i==0){
                leftExtreme[i]=height[i];
                continue;
            }
            leftExtreme[i]=Math.max(leftExtreme[i-1], height[i]);
        }

        for(int i = height.length-1 ; i>=0; i--){
            if(i==height.length-1){
                rightExtreme[i]=height[i];
                continue;
            }
            rightExtreme[i]=Math.max(rightExtreme[i+1], height[i]);
        }

        for(int i = 0 ; i<height.length ; i++){
            totalWater += (Math.min(leftExtreme[i] , rightExtreme[i])-height[i]);

        }

        return totalWater;
    }
}
