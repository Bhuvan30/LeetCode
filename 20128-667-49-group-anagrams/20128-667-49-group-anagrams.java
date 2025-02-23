class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ga=new HashMap<>();
        for(String str:strs){
            char[] ca=str.toCharArray(); 
            Arrays.sort(ca);
            String ss=String.valueOf(ca);
            if(!ga.containsKey(ss)){
                ga.put(ss,new ArrayList<>());
            }
            ga.get(ss).add(str);
        }
        return new ArrayList<>(ga.values());
    }
}