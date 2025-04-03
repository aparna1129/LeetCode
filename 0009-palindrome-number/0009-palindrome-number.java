class Solution {
    public boolean isPalindrome(int x) {
        int revNum = 0;
        int cp = x;
        while(x>0){
            int ld = x%10;
            revNum = (revNum*10)+ld;
            x = x/10;
        }
        if(cp == revNum) return true;
        else return false;
    }
}