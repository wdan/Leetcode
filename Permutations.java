public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(num[0]);
        list.add(a);
        for(int i = 1; i < num.length; i++) {
            list = insert(list, num[i]);
        }
        return list;
    }

    public ArrayList<ArrayList<Integer>> insert(ArrayList<ArrayList<Integer>> list, int num) {
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size() + 1; j++) {
                ArrayList<Integer> temp = new ArrayList<Integer>(list.get(i));
                temp.add(j, num);
                resultList.add(temp);
            }
        }
        return resultList;
    }
}