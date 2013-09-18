public class Solution {
    public int jump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (A.length <= 1) return 0;
        int[] map = new int[A.length];
        for (int i=0;i<A.length;i++)
            map[i] = -1;
        map[0] = 0;
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(0);
        while(queue.size()!=0){
            int index =  queue.poll();
            int currentStep = map[index];
            int x = A[index];
            int l = index - x;
            int r = index + x;
            for (int i=l;i<=r;i++){
                if (i < A.length && i>=0 && map[i]<0){
                    map[i] = currentStep + 1;
                    queue.add(i);
                    if (i == A.length - 1)
                        return map[i];
                }
            }
        }
        return -1;
    }
}