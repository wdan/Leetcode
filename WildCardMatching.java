public class Solution {
    public boolean isMatch(String s, String p) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s == null) return p == null;
        return isMatch(s, p, 0, 0);
    }
    public boolean isMatch(String s, String p, int stS, int stP){
        if (stP == p.length()) return stS == s.length();
        if (stS == s.length()){
            if (p.charAt(stP) == '*')
                return isMatch(s, p, stS, stP+1);
            return false;
        }
        if (p.charAt(stP) == '*'){
            for (int i=stS;i<=s.length();i++){
                if (isMatch(s, p, i, stP+1)) return true;
            }
            return false;
        }else{
            if (s.charAt(stS) == p.charAt(stP) || p.charAt(stP) == '?')
                return isMatch(s, p, stS+1, stP+1);
            else
                return false;
        }
    }
}