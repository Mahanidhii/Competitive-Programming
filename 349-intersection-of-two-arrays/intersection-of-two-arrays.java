class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s=new HashSet<>();
        HashSet<Integer> ans=new HashSet<>();
        for(int n:nums2){
            s.add(n);
        }
        for(int n:nums1){
            if(s.contains(n)){
                ans.add(n);
            }
        }
        int[] result=new int[ans.size()];
        int i=0;
        for(int n:ans){
            result[i]=n;
            i++;
        }
        return result;
    }
}