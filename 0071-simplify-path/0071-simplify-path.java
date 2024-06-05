class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        String[] parts = path.split("/");
        for(String s:parts){ 
            if(s.equals("..") && stack.size()!=0){
                stack.pop();
            }else if(s.equals("..")){
                continue;
            }else if(s.equals(".")){
                continue;
            }else if(s.equals("")){
                continue;
            }else{
                stack.push(s);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : stack) {
            sb.append("/"+s);
        }
        String result = sb.toString();
        if(result.equals("")){
            result="/";
        }
        System.out.println(result);
        return result;
    }
}