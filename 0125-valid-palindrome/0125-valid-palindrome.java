class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String x="";
        for(int i=0;i<s.length();i++){
            char y=s.charAt(i);
           if ((y >= 'a' && y <= 'z') || (y >= '0' && y <= '9')) {
    x += y;
}
        }
        String reversed=new StringBuilder(x).reverse().toString();
        if(x.equals(reversed)){
            return true;
        }
        return false;

    }
}