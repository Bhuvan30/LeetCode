class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a=0,b=0,max=0;
        HashSet<Character> hash_set=new HashSet<>();
        while(b<s.length()){
            if(!hash_set.contains(s.charAt(b))){
                hash_set.add(s.charAt(b));
                max=Math.max(hash_set.size(),max);
                b++;
            }else{
                hash_set.remove(s.charAt(a));
                a++;
            }
        }
        return max;
    }
}