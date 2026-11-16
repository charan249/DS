class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(map.containsKey(rem)){
             int[] ans={map.get(rem),i};
             return ans;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}