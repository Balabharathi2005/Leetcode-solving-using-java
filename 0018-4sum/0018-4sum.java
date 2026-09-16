class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;

                int left = j+1;
                int rigth = nums.length-1;

                while(left < rigth){
                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[rigth];
                    if(sum==target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[rigth]));

                        while(left<rigth && nums[left]==nums[left+1]){
                            left++;
                        }
                        while(left<rigth && nums[rigth]==nums[rigth-1]){
                            rigth--;
                        }
                        left++;
                        rigth--;

                    }
                    else if(sum > target){
                        rigth--;
                    }
                    else{
                        left++;
                    }
                }
            }
        }
        return list;
    }
}