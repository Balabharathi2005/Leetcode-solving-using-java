class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[(nums.length)*2];
        int i =0;
        int j=0;
        while(i!=ans.length){
            if(j>=nums.length){
                j=0;
            }
            ans[i]=nums[j];
            i++;
            j++;
            
        }
        
        return ans;
    }
}