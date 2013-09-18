public class Solution {
    public void nextPermutation(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = num.length;
        int now = len - 1;
        while(now > 0 && num[now] <= num[now-1]) now--;
        reverse(num, now, len - 1);
        if (now > 0){
            int next = now;
            now--;
            while(num[next] <= num[now]) next++;
            swap(num, now, next);
        }
    }
    public void reverse(int[] num, int a, int b){
        while (a<=b){
            swap(num, a, b);
            a++;
            b--;
        }
    }
    public void swap(int[] num, int a, int b){
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }
}