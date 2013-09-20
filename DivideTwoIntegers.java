public class Solution {
    public int divide(int dividend, int divisor) {
        // Start typing your Java solution below
        // DO NOT write main() function
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        long res = 0;
        while (a>=b){
            long c = b;
            long i = 0;
            while (a>=c){
                a-=c;
                c <<= 1;
                res += (1 << i);
                i++;
            }
        }
        boolean neg = false;
        if (dividend > 0) neg = !neg;
        if (divisor > 0) neg = !neg;
        return neg ? (int)(-res) : (int)(res);
    }
}