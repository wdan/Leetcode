public class Solution {
    public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s==null || s.isEmpty()) return 0;
        int st = -1;
        int ed = s.length() - 1;
        while(ed>=0 && s.charAt(ed)==' ') ed--;
        if (ed < 0) return 0;
        int p = 0;
        while(p<=ed){
            if (s.charAt(p)==' ')
                st = p;
            p++;
        }
        return ed - st;
    }
}