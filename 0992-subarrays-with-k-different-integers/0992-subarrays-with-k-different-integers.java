class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return atMost(nums,k) - atMost(nums,k-1);
    }

    private int atMost(int[] nums,int k){
        int left =0;
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int rigth =0;rigth<nums.length;rigth++){
            map.put(nums[rigth],map.getOrDefault(nums[rigth],0)+1);
            while(map.size() > k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                } 
                left++;
                }       
            count+=rigth - left +1;
        }
        return count;
    }

}