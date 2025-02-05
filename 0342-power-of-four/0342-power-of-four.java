class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1){
            return false;
        }
        int temp = (int)Math.pow(n,1.0/4.0);
        if (temp*temp*temp*temp == n){
            return true;
        }
        return false;
    }
}