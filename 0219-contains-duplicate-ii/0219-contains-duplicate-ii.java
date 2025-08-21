class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> duplex = new HashSet<>();
        for(int i=0; i<nums.length; i++){
        	if(duplex.contains(nums[i])) return true;
        	
            duplex.add(nums[i]);
            
            if(duplex.size()> k){
                duplex.remove(nums[i-k]);
            }
            
        }
        return false;
    }
}