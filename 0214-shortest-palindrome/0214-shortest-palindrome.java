class Solution {
    public String shortestPalindrome(String s) {
        if(s == null || s.length() == 0) return s;
        int len = s.length();
        int max = 0;
        for(int i = 1; i <= len; i++){
            if(check(s.substring(0, i)))
                max = Math.max(max, i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = len - 1; i >= max; i--){
            sb.append(s.charAt(i));
        }
        sb.append(s);
        return sb.toString();
    }
    private boolean check(String s){
        char[] arr = s.toCharArray();
        int len = s.length();
        for(int i = 0; i < len / 2; i++)
            if(arr[i] != arr[len - 1 - i]) return false;
        return true;
    }
}