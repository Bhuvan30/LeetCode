class Solution {
    public int lengthOfLastWord(String s) {
        int l=s.length();
        System.out.println(l);
        char last = ' ';
        int i=l-1;
        int count=0;
        while(i>=0&&(s.charAt(i)==last||s.charAt(i)!=' ')){
            if(s.charAt(i)!=' '){
                last = s.charAt(i);
                count++;}
            i--;
        }
        return count;
    }
}