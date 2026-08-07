class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hp= new HashMap<>();
        for(int num : nums){
            hp.put(num , hp.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->hp.get(a)-hp.get(b));

        for(int n : hp.keySet()){
            pq.add(n);
            if(pq.size()>k){
                pq.remove();
            }
        }

        int[] result = new int[k];
        int i = 0;

        while(pq.size()!=0){
            result[i]=pq.remove();
            i++;
        }

        return result;


        
    }
}
