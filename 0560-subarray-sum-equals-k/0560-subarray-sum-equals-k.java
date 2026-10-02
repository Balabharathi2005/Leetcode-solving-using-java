class Solution {
    public int subarraySum(int[] nums, int k) {
       Map<Integer,Integer> map = new HashMap<>();
       map.put(0,1);
       int count = 0;
       int presum = 0;
       for(int n:nums){
        presum+=n;
        if(map.containsKey(presum - k)){
            count+=map.get(presum - k);
        }
        map.put(presum,map.getOrDefault(presum,0)+1);
       }
       return count;
    }
}