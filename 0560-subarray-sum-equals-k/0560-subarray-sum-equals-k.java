class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        map.put(0,1);
        int prefixsum =0;
        for(int n:nums){
            prefixsum+=n;
            if(map.containsKey(prefixsum-k)){
                count+=map.get(prefixsum-k);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}