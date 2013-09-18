import java.util.*;
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] pos = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            pos[i] = i;
        }
        sort(numbers, pos, 0, numbers.length-1);
        int[] ans = new int[2];
        for (int i = 0;i<numbers.length-1;i++){
            int index = Arrays.binarySearch(numbers, target - numbers[i]);
            if ((index != i)&&(index >= 0)){
                int a = pos[i]+1;
                int b = pos[index]+1;
                ans[0] = a > b ? b : a;
                ans[1] = a > b ? a : b;
                break;
            }
        }
        return ans;
    }
    public static void sort(int[] numbers, int[] pos, int st, int ed){
        int i = st; int j = ed;
        int x = numbers[(st + ed) / 2];
        do{
            while(numbers[i]<x) i++;
            while(numbers[j]>x) j--;
            if (i<=j){
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
                int posTemp = pos[i];
                pos[i] = pos[j];
                pos[j] = posTemp;
                i++; j--;
            }
        }while(i<j);
        if (i<ed) sort(numbers, pos, i, ed);
        if (j>st) sort(numbers, pos, st, j);
    }
}