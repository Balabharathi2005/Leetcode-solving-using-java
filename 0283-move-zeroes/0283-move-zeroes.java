class Solution {
    public int[] moveZeroes(int[] nums) {
        int left = 0 ;
        int rigth = 0;
        while(rigth < nums.length){
            if(nums[rigth]!=0){
                int temp = nums[rigth];
                nums[rigth] = nums[left];
                nums[left]= temp;
                left++;
                
            }
            rigth++;
        }
        return nums;
    }
}
        
        
    
