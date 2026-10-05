class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i>0){
            result[i] = nums[i-1] * result[i-1];
            } 
            else{
                result[i] = 1;
            }
        }
        int rigthproduct = 1;
        for(int i=nums.length-1;i>=0;i--){
            if(i < nums.length -1){
                result[i]=result[i]*rigthproduct;
                rigthproduct *= nums[i]; 
            }
            else{
                rigthproduct *=nums[i];
            }
        }
        return result;

    }
}