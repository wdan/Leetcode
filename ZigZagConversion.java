public class Solution {
    public String convert(String s, int nRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<nRows;i++){
            int now = i;
            while(now<s.length()){
                sb.append(s.charAt(now));
                now += (2 * nRows - 2);
                if (i!=0 && i!=nRows-1 && now - 2 * i < s.length())
                    sb.append(s.charAt(now - 2 * i));
            }
        }
        return sb.toString();
    }
}