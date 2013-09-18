public class Solution {
    public String simplifyPath(String path) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Stack<String> st = new Stack<String>();
        String[] tokens = path.trim().split("/");
        for (String s:tokens){
            if (s == null || s.length()==0 || s.equals(".")){
                continue;
            }else if (s.equals("..")){
                if (st.size()>0) st.pop();
            }else{
                st.push(s);
            }
        }
        if (st.empty()) return "/";
        StringBuffer sb = new StringBuffer();
        while(!st.empty()){
            sb.insert(0, st.pop());
            sb.insert(0, "/");
        }
        return sb.toString();
    }
}