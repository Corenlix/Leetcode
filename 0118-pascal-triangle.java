// https://leetcode.com/problems/pascals-triangle/submissions/893326605/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        var list = new ArrayList<List<Integer>>();
        list.add(List.of(1));
        List<Integer> lastList = Collections.emptyList();
        for (int row = 0; row < numRows-1; row++) {
            var newList = new ArrayList<Integer>(row+4);
            newList.add(1);
            for (int i = 0; i < row; i++) {
                newList.add(lastList.get(i) + lastList.get(i+1));
            }
            newList.add(1);
            lastList = newList;

            list.add(newList);
        }
        return list;
    }
}