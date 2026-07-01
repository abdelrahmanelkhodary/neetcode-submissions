class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        
        for (int i = 0 ; i < tokens.length ; i ++){
            if (tokens[i].equals("+")){
                int v1 = Integer.parseInt(stack.pop());
                int v2 = Integer.parseInt(stack.pop());
                int result = v1 + v2 ;
                
                stack.push(result+"");
            }
            else if (tokens[i].equals("-")){
                int v1 = Integer.parseInt(stack.pop());
                int v2 = Integer.parseInt(stack.pop());
                int result = v2 - v1 ;
                stack.push(result+"");
            }
            else if (tokens[i].equals("*")){
                int v1 = Integer.parseInt(stack.pop());
                int v2 = Integer.parseInt(stack.pop());
                int result = v1 * v2 ;
                stack.push(result+"");
            }
            else if (tokens[i].equals("/")){
                int v1 = Integer.parseInt(stack.pop());
                int v2 = Integer.parseInt(stack.pop());
                int result = v2 / v1 ;
                stack.push(result+"");
            }
            else{
                stack.push(tokens[i]);
            }

        }
        int evalRPN =Integer.parseInt( stack.pop());
        return evalRPN;
    }
}
