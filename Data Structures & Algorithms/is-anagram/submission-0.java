class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> h1 = new HashMap<>();
        HashMap<Character,Integer> h2 = new HashMap<>();

        for(int i= 0 ; i<s.length(); i++){
            char c = s.charAt(i);
            h1.put(c, h1.getOrDefault(c,0)+1);
        }
        for(int i= 0 ; i<t.length(); i++){
            char c = t.charAt(i);
            h2.put(c, h2.getOrDefault(c, 0)+1);
        }
        
        if(h1.equals(h2)){
            return true;
        }

        return false;

    }
}
