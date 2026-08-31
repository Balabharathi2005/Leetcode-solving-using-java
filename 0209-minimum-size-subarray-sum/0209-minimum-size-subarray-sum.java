class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int minlength=Integer.MAX_VALUE;
        int length=0;
        int left=0;
        int sum=0;
        for(int rigth=0;rigth<nums.length;rigth++){
            sum+=nums[rigth];
            while(sum>=target){
                length=rigth-left+1;

                if(length<minlength){
                        minlength=length;
                    }
                sum=sum-nums[left++];
            }
        }
        return (length==0) ? 0:minlength;
    }
}