public class Solution {
    public int maxArea(int[] height) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = height.length;
        int ans = 0;
        int st = 0, ed = len - 1;
        while (st<ed){
            int now = (Math.min(height[st], height[ed])) * (ed - st);
            if (now > ans)
                ans = now;
            if (height[st] < height[ed])
                st++;
            else
                ed--;
        }
        return ans;
    }
}