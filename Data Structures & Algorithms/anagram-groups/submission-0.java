class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> hp = new HashMap<>();

        List<List<String>> finalList = new ArrayList<>();
        

        for(int i = 0 ;i<strs.length; i++){
            String str = strs[i];
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sortedStr = new String(c);
            if(!hp.containsKey(sortedStr)){
                List<String> list = new ArrayList<>();
                list.add(str);
                hp.put(sortedStr, list);
                
            }else{
                List<String> list = hp.get(sortedStr);
                list.add(str);
                hp.put(sortedStr,list);
            }
        }

        for (Map.Entry<String, List<String>> entry : hp.entrySet()) {
            finalList.add(entry.getValue());
        }

        return finalList;

    }
}
