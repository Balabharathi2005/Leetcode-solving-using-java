class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0;
        int left =0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int rigth = 0;rigth<fruits.length;rigth++){
           
            map.put(fruits[rigth],map.getOrDefault(fruits[rigth],0)+1);
            while(map.size() > 2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                    left++;
                
            }
            max = Math.max(max,rigth - left + 1);
        }
        return max;
    }
}