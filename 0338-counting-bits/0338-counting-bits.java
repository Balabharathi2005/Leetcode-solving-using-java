class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        if(n==0) {
            ans[0]=0;
            return ans;
        }
        long ints;
        int count=0;
        String binary;
        for(int i=1;i<=n;i++){
            count=0;
           binary=Integer.toBinaryString(i);
           ints=Long.parseLong(binary);
           while(ints!=0){
            long temp=ints%10;
            count+=temp;
            ints/=10;
           }
           ans[i]=count;
        }
        return ans;
    }
}