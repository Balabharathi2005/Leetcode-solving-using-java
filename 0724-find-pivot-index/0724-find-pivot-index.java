class Solution {
    public int pivotIndex(int[] nums) {
        
        int left_sum = 0;

        int rigth_sum = 0;

        int total_sum =0;

        for(int i=0; i<nums.length;i++){
            total_sum+=nums[i];
        }
        for(int i =0 ;i<nums.length;i++){
            rigth_sum = total_sum - left_sum - nums[i];
            if(left_sum == rigth_sum){
                return i;
            }
            left_sum+=nums[i];
        }


       
        return -1;
    }
}