class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int x,y;
        for(String s:tokens){
            if(s.equals("+")){
                x=stack.pop();
                y=stack.pop();
                stack.push(y+x);
            }else if(s.equals("-")){
                x=stack.pop();
                y=stack.pop();
                stack.push(y-x);
            }else if(s.equals("/")){
                x=stack.pop();
                y=stack.pop();
                stack.push(y/x);
            }else if(s.equals("*")){
                x=stack.pop();
                y=stack.pop();
                stack.push(y*x);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}