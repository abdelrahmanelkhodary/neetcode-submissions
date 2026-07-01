class Solution {
    public boolean isValid(String s) {
        Stack <Character> checker = new Stack<>();
        if (s.length()==0){
        return true;
        }
        
        for (int i =0 ; i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                checker.push(s.charAt(i));
            }
            else{
                if(checker.isEmpty()){
                    return false;
                }
                if ((s.charAt(i)==')'&& checker.peek()== '(')
                    || (s.charAt(i)=='}'&& checker.peek()== '{')
                    || (s.charAt(i)==']'&& checker.peek()== '[')
                    )
                    {
                    checker.pop();
                }
                else{
                    return false ;
                }
        }
        

        }
        if (checker.isEmpty()){
            return true;
        }
        else {
            return false ;
        }

    }
}
