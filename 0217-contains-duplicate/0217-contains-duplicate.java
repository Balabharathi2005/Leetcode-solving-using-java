class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums) {
            
            seen.add(num);
        }
        if(n!=seen.size()){
            return true;
        }
        return false;
    }
}
