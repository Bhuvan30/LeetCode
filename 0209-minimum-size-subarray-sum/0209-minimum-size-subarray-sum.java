class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int range=Integer.MAX_VALUE;
        int l=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            while(sum>=target){
                range=Math.min(range,i-l+1);
                sum-=nums[l];
                l++;
            }
        }
        return (range!=Integer.MAX_VALUE)?range:0;
    }
}