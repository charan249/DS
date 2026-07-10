class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> map1=new HashMap<>();
        Map<Character,Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(!map1.containsKey(c1) && !map2.containsKey(c2)){
                map1.put(c1,c2);
                map2.put(c2,c1);
            }
            else{
                if(map1.getOrDefault(c1,'#')!=c2 || map2.getOrDefault(c2,'#')!=c1)
                return false;
            }
        }
        return true;

        
    }
}