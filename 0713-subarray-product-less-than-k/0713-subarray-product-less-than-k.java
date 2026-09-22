class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int count=0;
        int left = 0;
        int prod = 1;
        for(int rigth = 0;rigth<nums.length;rigth++){

            prod*=nums[rigth];
            while(prod >= k ){
                prod/=nums[left];
                left++;
            }

            count+=rigth-left+1;
        }
        return count;
    }
}