class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_count = 0;
        int curr_count = 0;
        int j=0;
        while(j < nums.length){
            if(nums[j]==1){
                curr_count++;

            }
            else{
                max_count = Math.max(max_count,curr_count);
                curr_count=0;
            }
            j++;
        }
        return (max_count > curr_count)? max_count:curr_count;
    }
}