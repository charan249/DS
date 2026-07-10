class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        String ans="";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char x=s.charAt(i);
            if(!st.isEmpty() && st.peek()==x){
             st.pop();
            }
            else{
                st.add(x);}
            }
            while(st.size()!=0){
                ans+=st.pop();
            }
            String rev = new StringBuilder(ans).reverse().toString();

        return rev;
        
    }
}