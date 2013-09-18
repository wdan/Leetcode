public class Solution {
    public ArrayList<String> letterCombinations(String digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String[] map ={" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ArrayList<String> ans = new ArrayList<String>();
        if (digits == null || digits.isEmpty()){
            ans.add("");
            return ans;
        }
        StringBuffer sb = new StringBuffer();
        search(map, ans, sb, digits, 0);
        return ans;
    }
    public static void search(String[] map, ArrayList<String> ans, StringBuffer sb, String digits, int now){
        if (now == digits.length()){
            ans.add(sb.toString());
            return;
        }
        for (int i=0;i<map[digits.charAt(now) - '0'].length();i++){
            sb.append(map[digits.charAt(now) - '0'].charAt(i));
            search(map, ans, sb, digits, now+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}