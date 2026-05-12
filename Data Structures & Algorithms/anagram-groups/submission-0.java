
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       HashMap<String , List<String>> groups = new HashMap<>();

       for(String str : strs){
        char[] chars = str.toCharArray(); // turns string into char array
        Arrays.sort(chars); // sorts the char array from EX: "ate" to "aet"
        String sortedStr = new String(chars); //makes sort array the string that is used as key

        if (!groups.containsKey(sortedStr)) {
            groups.put(sortedStr, new ArrayList<>()); //creates list for unique signatures
        }
        groups.get(sortedStr).add(str); // adds matching word to the list 
       }

       return new ArrayList<>(groups.values());
        
    }
}
