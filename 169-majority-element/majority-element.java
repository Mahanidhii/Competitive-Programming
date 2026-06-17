class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> m=new HashMap<>();
        int n=nums.length;
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
            if(m.get(i)>n/2){
                return i;
            }
        }
        return -1;
    }
}