// https://leetcode.com/problems/top-k-frequent-elements/description/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countsMap = new HashMap<>();
        for (int num : nums) {
            countsMap.put(num, countsMap.getOrDefault(num, 0) + 1);
        }
        
        var list = new ArrayList<Map.Entry<Integer, Integer>>();
        for(var countsEntry : countsMap.entrySet()) {
            list.add(countsEntry);
        }

        list.sort((x, y) -> {
            if (x.getValue() < y.getValue()) return 1;
            else if (x.getValue() == y.getValue()) return 0;
            else return -1;
        });
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
        
        return result;
    }
}