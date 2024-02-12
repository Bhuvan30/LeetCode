class Solution {
    public int strStr(String haystack, String needle) {
        int hl=haystack.length();
        int nl=needle.length();
        int j=0;
        for(int i=0;i<hl;i++){
            // System.out.println(haystack.charAt(i)==(needle.charAt(j)));
            // System.out.println(haystack.charAt(i)+" "+needle.charAt(j));
            System.out.println(i+" "+j);
            if(haystack.charAt(i)==(needle.charAt(j))){
                // System.out.println(i+" "+j);
                // System.out.println(haystack.charAt(i)==(needle.charAt(j)));
                // System.out.println(haystack.charAt(i)+" "+needle.charAt(j));
                if(j==nl-1){
                    // System.out.println(haystack.charAt(i)==(needle.charAt(j)));
                    return i-j;
                }               
                j++;
            }else{
                if(j!=0)
                i=i-j;
                j=0;
            }
        }
    
    return -1;
    }
}