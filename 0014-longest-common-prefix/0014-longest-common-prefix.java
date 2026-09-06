class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;

        Arrays.sort(strs,(a,b)-> a.compareTo(b));
        String ans="";
        if(strs[0].length()==0) return ans;
        for(int i=0;i<strs[0].length();i++){

            
            

            if(strs[0].charAt(i)==strs[n-1].charAt(i)){
                ans+=strs[0].charAt(i);
            }
            else{
                break;
            }
        } return ans;
    }
}