public class Solution {
    public boolean isMatch(String s, String p) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s == null) return p == null;
        return isMatch(s, p, 0, 0);
    }
    public boolean isMatch(String s, String p, int stS, int stP){
        if (stP == p.length()) return stS == s.length();
        if (stP == p.length() - 1 || p.charAt(stP + 1) != '*'){
            if (stS == s.length()) return false;
            if (s.charAt(stS) == p.charAt(stP) || p.charAt(stP) == '.')
                return isMatch(s, p, stS + 1, stP + 1);
            return false;
        }
        while (stS < s.length() && (p.charAt(stP) == '.' || p.charAt(stP) == s.charAt(stS)))
            if (isMatch(s, p, stS++, stP+2)) return true;
        return isMatch(s, p, stS, stP+2);
    }
}