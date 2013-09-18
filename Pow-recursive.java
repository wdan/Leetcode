public class Solution {
    public double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        double ans = x;
        if (n==1) return x;
        if (n==0) return 1;
        boolean neg = false;
        if (n<0){
            neg = true;
            n = -n;
        }
        ans = pow(x, n/2);
        ans *= ans;
        if (n%2!=0) ans*=x;
        if (!neg)
            return ans;
        else
            return 1.0/ans;
    }
}