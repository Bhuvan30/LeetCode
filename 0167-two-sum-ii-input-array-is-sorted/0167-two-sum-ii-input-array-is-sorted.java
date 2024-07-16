class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int a=0,b=n-1;
        int sum=0;
        while(a<=b){
            sum=numbers[a]+numbers[b];
            if(sum>target){
                b-=1;
            }else if(sum<target){
                a+=1;
            }else{
                return new int[]{a+1,b+1};
            }
        }
        return new int[]{a+1,b+1};
    }
}