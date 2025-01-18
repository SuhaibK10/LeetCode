class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int b = s.lastIndexOf(" ");
        int c = s.length();
        int d = c-b-1;
        return d;
        
    }
}