class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> result=new ArrayList<>();
        for(Integer key:map.keySet()){
            if(map.get(key)>n/3){
                result.add(key);
            }
        }
        return result;
    }
}