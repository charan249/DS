class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        for(int i=0;i<n;i++){
            int count=1;
            Set<Character> set=new HashSet<>();
            set.add(s.charAt(i));
            for(int j=i+1;j<n;j++){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                count++;
            }
            else{
               break;
                }
                
            }
             if(count>max){
                    max=count;
            }
             
        } return max;
    }
}