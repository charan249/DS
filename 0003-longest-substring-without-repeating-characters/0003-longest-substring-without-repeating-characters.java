class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        for(int j=0;j<n;j++){
            Set<Character> set=new HashSet<>();
            int length=0;
        for(int i=j;i<n;i++){
            char x=s.charAt(i);
            if(set.contains(x)){
                break;
            }
            else{set.add(x);
            length++;}
            if(length>max){
                    max=length;
                }
        }}
        return max;
    }
}