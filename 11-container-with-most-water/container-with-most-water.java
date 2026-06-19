class Solution {
    public int maxArea(int[] height) {
        int maxA=0;
        int length=0;
        int r=height.length-1;
        while(length<r){
            int len=Math.min(height[length], height[r]);
            int width=r-length;
            int area=len*width;
            maxA=Math.max(area,maxA);
            if(height[length]<height[r]) length++;
            else    r--;
        }
        return maxA;
    }
}