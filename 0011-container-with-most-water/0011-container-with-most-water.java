class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int rigth = height.length-1;
        int max = 0;
        while(left < rigth){
            int minheight = (height[left] < height[rigth]) ? height[left]:height[rigth];
            int area = minheight * (rigth-left);
            max = Math.max(area,max);
            if(height[left] < height[rigth]){
                left++;
            }
            else{
                rigth--;
            }
        }
        return max;
    }
}