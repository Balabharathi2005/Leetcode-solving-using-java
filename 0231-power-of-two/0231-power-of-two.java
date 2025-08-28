class Solution {
    int i=0;
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if(n==8) return true;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n==Math.pow(2,i)){
                return true;
            }
        }
        return false;
    }
}