public class Solution {
    public String multiply(String num1, String num2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len1 = num1.length();
        int len2 = num2.length();
        int[] ans = new int[len1 + len2];
        for (int i=0;i<len1+len2-1;i++) ans[i] = 0;
        for (int i=len1-1;i>=0;i--)
            for (int j=len2-1;j>=0;j--){
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';
                int t = a * b;
                int index = (len1 - i - 1) + (len2 - j - 1);
                ans[index] += t;
            }
        int last = 0;
        for (int i=0;i<len1+len2-1;i++){
            ans[i+1] += ans[i] / 10;
            ans[i] = ans[i] % 10;
            if (ans[i]!=0) last = i;
        }
        if (ans[len1+len2-1] > 0) last = len1 + len2 - 1;
        StringBuffer sb = new StringBuffer();
        for (int i=last;i>=0;i--)
            sb.append((char)('0' + ans[i]));
        return sb.toString();
    }
}