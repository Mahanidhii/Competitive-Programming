// 217,242,349,350,387,169,229,202,128
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m=new HashMap<>();
        for(int i=0;i<=nums.length;i++){
            int pair=target-nums[i];
            if(m.containsKey(pair)){
                return new int[]{i, m.get(pair)};
            }
            m.put(nums[i],i);
        }
        return new int[]{};
    }
}