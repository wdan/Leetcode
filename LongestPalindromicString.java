public class Solution {
    public String longestPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s.isEmpty()) return "";
        int len = s.length();
        int max = 0;
        int ans = 0;
        for (int i=0;i<len;i++){
            int t = search(s, i, i);
            if (t*2+1>=max){
                max = t * 2 + 1;
                ans = i - t;
            }
            t = search(s, i, i + 1);
            if ((t+1)*2>=max){
                max = (t + 1) * 2;
                ans = i - t;
            }
        }
        return s.substring(ans, ans+max);
    }
    public static int search(String s, int left, int right){
        int st = left, ed = right;
        int count = 0;
        if (left < 0 || right >= s.length()) return -1;
        while (s.charAt(st) == s.charAt(ed)){
            st--;
            ed++;
            count++;
            if (st<0 || ed>=s.length()) break;
        }
        return count - 1;
    }
}