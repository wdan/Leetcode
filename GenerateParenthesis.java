public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> ans = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        if (n > 0) generate(ans, sb, 0, 0, n);
        return ans;
    }
    public static void generate(ArrayList<String> ans, StringBuilder sb, int left, int right, int n){
        if (left == n){
            for (int i=0;i<n-right;i++)
                sb.append(')');
            ans.add(sb.toString());
            for (int i=0;i<n-right;i++)
                sb.deleteCharAt(sb.length()-1);
            return;
        }
        sb.append('(');
        generate(ans, sb, left+1, right, n);
        sb.deleteCharAt(sb.length()-1);
        if (left > right){
            sb.append(')');
            generate(ans, sb, left, right+1, n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}