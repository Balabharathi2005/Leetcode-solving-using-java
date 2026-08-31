class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max = 0;
    

        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max=sum;

        int startindex=0;
        int endindex=k;
        while(endindex < nums.length)
        {
            sum=sum-nums[startindex++];

            sum=sum+nums[endindex++];
            
            if(max<sum){
                max=sum;
            }
        }
        return max/k;
    }
}