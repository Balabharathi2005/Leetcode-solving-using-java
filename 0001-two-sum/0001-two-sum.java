class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                   return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args){
        int[] nums={3,2,4};
        int target=6;
        int[] re=twoSum(nums,target);
        System.out.print("["+re[0]+","+re[1]+"]");
    }
}