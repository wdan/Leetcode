public class Solution {
    public double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (n == 0) return 1;
        if (x == 0) return 0;
        boolean neg = false;
        if (n < 0){
            neg = true;
            n = -n;
        }
        double res = 1;
        while(n>0){
            if (n % 2 == 1){
                res *= x;
            }
            x*=x;
            n = n / 2;
        }
        if (neg)
            return 1.0/res;
        else
            return res;
    }
}