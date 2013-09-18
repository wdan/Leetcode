public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] map = new int[256];
        Arrays.fill(map, -1);
        int st = 0, ans = 0;
        for (int i=0;i<s.length();i++){
            st = Math.max(st, map[(int)s.charAt(i)] + 1);
            map[(int)s.charAt(i)] = i;
            ans = Math.max(ans, i - st + 1);
        }
        return ans;
    }
}