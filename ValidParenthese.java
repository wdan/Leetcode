public class Solution {
    public boolean isValid(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Stack<Character> st = new Stack<Character>();
        for (int i=0;i<s.length();i++){
            char t = s.charAt(i);
            if (t == '(' || t == '{' || t == '[')
                st.push(t);
            else{
                if (st.empty()) return false;
                char top = st.pop();
                switch(t){
                    case ')': if (top!='(') return false; break;
                    case ']': if (top!='[') return false; break;
                    case '}': if (top!='{') return false; break;
                }
            }
        }
        if (st.empty())
            return true;
        else
            return false;
    }
}