class Solution {
    public boolean detectCapitalUse(String word) {
        
    int count =0;
    for (int i =0;i<word.length();i++){
        if (word.charAt(i)>='A' && word.charAt(i)<='Z'){
            count++;
        }}
        if (count==word.length()){  // if all letters are capital
            return true;
        }



    if (count==0){
         // if all letters are small
        return true;
    }

    if(word.charAt(0)>='A' && word.charAt(0)<='Z' && count==1 ){  
        // if first letter is capital
            return true;
        }
        return false;
    }}

        
    
