// https://leetcode.com/problems/group-anagrams/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap();

        for(String word : strs){
            var chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(map.containsKey(key)){
                map.get(key).add(word);
            } else {
                List<String>list = new ArrayList<String>();
                list.add(word);
                map.put(key,list);
            }

        }
        
        return new ArrayList<List<String>>(map.values());
    }
}