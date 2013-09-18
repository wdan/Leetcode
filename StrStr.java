public class Solution {
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (needle.isEmpty()) return haystack;
        if (haystack.isEmpty()) return null;
        int lenHaystack = haystack.length();
        int lenNeedle = needle.length();
        int ans = -1;
        for (int i=0;i<lenHaystack;i++){
            int stHaystack = i;
            int stNeedle = 0;
            while (haystack.charAt(stHaystack) == needle.charAt(stNeedle)){
                stHaystack++;
                stNeedle++;
                if (stNeedle == lenNeedle){
                    ans = i;
                    break;
                }
                if (stHaystack == lenHaystack) break;
            }
            if (ans >= 0) break;
        }
        if (ans >= 0 ) return haystack.substring(ans);
        else return null;
    }
}