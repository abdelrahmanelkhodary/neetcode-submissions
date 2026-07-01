class Solution {
    public boolean isPalindrome(String s) {
        
        String word="";

        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                word += Character.toLowerCase(c);
            }
        }
        
        int n = word.length();
        
        for (int i = 0 ; i < n/2;i++){
            if (word.charAt(i)!=word.charAt(n-i-1)){
                return false;
            }
        }
        return true ;
    }
}
