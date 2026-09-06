class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int xor=0;
        int ans=0;
        for(int i=0;i<n;i++){
         xor^=nums[i];
        }
        for(int i=0;i<n;i++){
            if((xor^nums[i])==0){
                ans=nums[i];
                break;
            }
        }
        return ans;
    }
}