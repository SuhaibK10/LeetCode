class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String b =  "";
        String c = "";
        for (int i =0;i<word1.length;i++){
          b = b + word1[i];
      }

        for (int i =0;i<word2.length;i++){
            c = c + word2[i];
        }
        if(c.equals(b)){
            return true;
        }
        return false;
        
    }
}