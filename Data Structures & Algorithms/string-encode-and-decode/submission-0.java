


public class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        
        for (String str : strs) {
            // Append length + '#' + the actual string
            encoded.append(str.length()).append("#").append(str);
        }
        
        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0; // Our pointer to traverse the encoded string
        
        while (i < str.length()) {
            // Find where the delimiter '#' is
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            
            // The substring between i and j is the number representing the length
            int length = Integer.parseInt(str.substring(i, j));
            
            // Move our pointer right past the '#'
            i = j + 1;
            
            // Extract the actual string using the parsed length
            String originalStr = str.substring(i, i + length);
            decoded.add(originalStr);
            
            // Move the pointer past the extracted string to start the next loop
            i += length;
        }
        
        return decoded;
    }
}
    

