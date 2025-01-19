class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String b ="";
        for (int i=s.length()-1;i>=0;i--){
            b = b + s.charAt(i);
        }
            if(s.equals(b)){
            return true;
        }
        return false;
        
    }
}