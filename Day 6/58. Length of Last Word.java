class Solution {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int length = 0;
        
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                length++;
            } else if (length > 0) {
                break;
            }
        }
        
        return length;
    }
}
