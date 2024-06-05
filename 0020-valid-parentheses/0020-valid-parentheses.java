class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        // stack.push(')');
        // stack.isEmpty();
        // stack.pop();
        // for(String i :s){
        //     System.out.println(i);
        // }
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c==')' && stack.size()!=0 && stack.peek()=='('){
                stack.pop();
            }else if(c=='}'  && stack.size()!=0 && stack.peek()=='{'){
                stack.pop();
            }else if(c==']'  && stack.size()!=0 && stack.peek()=='['){
                stack.pop();
            }else {
                stack.push(c);  
            }     
        }
        return stack.isEmpty();
    }
}