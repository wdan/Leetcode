public class Solution {
    public boolean canJump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean[] map = new boolean[A.length];
        for (int i=0;i<A.length;i++)
            map[i] = false;
        map[0] = true;
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(0);
        while(queue.size()!=0){
            int index =  queue.poll();
            int x = A[index];
            int l = index - x;
            int r = index + x;
            if (l >=0 && !map[l]){
                map[l] = true;
                queue.add(l);
            }
            if (r < A.length && !map[r]){
                map[r] = true;
                queue.add(r);
            }
            if (r >= A.length){
                map[A.length - 1] = true;
                break;
            }
        }
        return map[A.length - 1];
    }
}