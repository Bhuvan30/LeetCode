class Solution {
    public String reverseWords(String s) {
        s=" "+s+" ";
        // System.out.println(s);
        String r="";
        int j=s.length()-1;
        for(int i=s.length()-2;i>0;i--){
            if(s.charAt(i)==' '&&s.charAt(i-1)!=' '){
                // System.out.println(s.charAt(i)+" "+i);
                j=i;
            }if(s.charAt(i)!=' '&&s.charAt(i-1)==' '){
                // System.out.println(s.substring(i, j));
                r=r+s.substring(i, j)+" ";
                // System.out.println(s.substring(i, j));
                j=i;
            }
        }
        r= r.trim();
        // System.out.println(r);
        return r;
    }
}