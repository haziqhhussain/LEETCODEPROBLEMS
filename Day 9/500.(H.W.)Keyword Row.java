import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        int[] rowMap = new int[26];
        
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        
        for (char c : row1.toCharArray()) rowMap[c - 'a'] = 1;
        for (char c : row2.toCharArray()) rowMap[c - 'a'] = 2;
        for (char c : row3.toCharArray()) rowMap[c - 'a'] = 3;
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            String lower = word.toLowerCase();
            int targetRow = rowMap[lower.charAt(0) - 'a'];
            boolean isValid = true;
            
            for (int i = 1; i < lower.length(); i++) {
                if (rowMap[lower.charAt(i) - 'a'] != targetRow) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }
}
