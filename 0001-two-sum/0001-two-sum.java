class Solution {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set=new HashSet<>();
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(!set.contains(target-nums[i])){
                set.add(nums[i]);
            }
            else{
                ans[1]=i;
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target-nums[ans[1]]){
                ans[0]=i;
                break;
            }
           
        }
        return ans;
    }
}