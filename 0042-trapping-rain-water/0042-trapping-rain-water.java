class Solution {
    public int trap(int[] height) {
        int left=0;
        int rigth = height.length-1;
        int left_max=height[left];
        int rigth_max = height[rigth];
        int water=0;
        while(left < rigth){
            if(left_max < rigth_max){
                left++;
                left_max = Math.max(left_max,height[left]);
                water += left_max-height[left];
            }
            else{
                rigth--;
                rigth_max=Math.max(rigth_max,height[rigth]);
                water += rigth_max - height[rigth];
            }
        }
        return water;
    }
}