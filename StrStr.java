public class Solution {
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (needle == null || needle.isEmpty()) return haystack;
        int len1 = haystack.length();
        int len2 = needle.length();
        for (int i=0;i<=len1 - len2;i++){
            int j;
            for (j=0;j<len2;j++){
                if (haystack.charAt(i+j)!=needle.charAt(j)) break;
            }
            if (j == len2) return haystack.substring(i);
        }
        return null;
    }
}