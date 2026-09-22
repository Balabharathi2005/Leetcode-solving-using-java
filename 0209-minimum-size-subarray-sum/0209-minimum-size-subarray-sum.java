class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int minlength=Integer.MAX_VALUE;
        int length=0;
        int left=0;
        int rigth = 0;
        int sum=0;
        while(rigth < nums.length){
            sum+=nums[rigth];
            while(sum >= target){
                length = rigth - left + 1;

                minlength = Math.min(length,minlength);

                sum-=nums[left];
                left++;
            }
            rigth++;
        }
        return Math.min(length,minlength);
        
    }
}