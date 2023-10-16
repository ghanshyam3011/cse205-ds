class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // Count the frequency of each character in the string
        int count =0 ;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{// first time enterd
                count++;
                map.put(ch,1);
            }
        }

        // Create a list of characters and sort it based on the frequencies
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            char ch = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
