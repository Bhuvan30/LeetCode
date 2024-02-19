class Solution {
    public int romanToInt(String s) {
            HashMap<Character, Integer> roman = new HashMap<Character, Integer>();
int tot=0;
    roman.put('I', 1);
    roman.put('V', 5);
    roman.put('X', 10);
    roman.put('L', 50);
    roman.put('C', 100);
    roman.put('D', 500);
    roman.put('M', 1000);

    for(int i=0;i<s.length();i++){
        if(i+1<s.length()){
            // System.out.println(s.charAt(i));
            // System.out.println(roman.get(s.charAt(i)));
        if(roman.get(s.charAt(i))<roman.get(s.charAt(i+1))){
            tot=tot-roman.get(s.charAt(i));
        }else{
            tot=tot+roman.get(s.charAt(i));
        }}else{
            tot=tot+roman.get(s.charAt(i));
        }
    }
        return tot;
    }
}