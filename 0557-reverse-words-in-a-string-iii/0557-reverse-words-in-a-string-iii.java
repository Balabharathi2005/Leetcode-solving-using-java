class Solution {
    public String reverseWords(String s) {
        String[] st  =s.split("\\s+");
        String str="";
        for(int k=0;k<st.length;k++){
            char[] ch =st[k].toCharArray();
            int i=0;
            int j=ch.length-1;
            while(i<j){
                char temp= ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
            str+=String.valueOf(ch);
            if(k<st.length-1){
                str+=" ";
            }

        }
        return str;
    
    }
}