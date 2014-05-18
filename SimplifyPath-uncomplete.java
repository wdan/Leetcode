public class Solution {
    public String simplifyPath(String path) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (path==null || path.isEmpty()) return null;
        int len = path.length();
        int[] his = new int[len];
        his[0] = 0;
        int pos = 0;
        StringBuffer sb = new StringBuffer(path);
        for (int i=1;i<sb.length();i++){
            if (path.charAt(i) == '/'){
                pos++;
                his[pos] = i - 1;
            }
            if (path.charAt(i) == '.'){
                if (i == sb.length() - 1 || path.charAt(i+1) == '/'){
                    sb.deleteCharAt(i);
                    if (i < sb.length())
                        sb.deleteCharAt(i);
                }else{
                    sb.delete(his[pos] + 1, i + 3);
                    i = his[pos];
                    pos--;
                }
            }
        }
        if (sb.charAt(sb.length() - 1) == '/')
            sb.deleteCharAt(sb.length() - 1);
        return sb.toString();

    }
}