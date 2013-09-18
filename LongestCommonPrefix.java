public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (strs.length == 0) return "";
        StringBuffer ans = new StringBuffer();
        for (int i = 0;i<strs[0].length();i++){
            char t = strs[0].charAt(i);
            for (int j = 1;j < strs.length;j++){
                if (i >= strs[j].length() || strs[j].charAt(i)!=t)
                    return ans.toString();
            }
            ans.append(t);
        }
        return ans.toString();
    }
}