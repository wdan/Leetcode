public class Solution {
    public String countAndSay(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String s = "1";
        for(int i=1;i<n;i++){
            StringBuffer sb =  new StringBuffer();
            int count = 1;
            char x = '-';
            for (int j=0;j<s.length();j++){
                if (x == '-'){
                    x = s.charAt(j);
                }else if (s.charAt(j) == x){
                    count++;
                }else{
                    sb.append(new Integer(count).toString());
                    sb.append(x);
                    x = s.charAt(j);
                    count = 1;
                }
            }
            sb.append(new Integer(count).toString());
            sb.append(x);
            s = sb.toString();
        }
        return s;
    }
}