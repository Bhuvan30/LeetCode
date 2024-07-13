class Solution {
    public int jump(int[] nums) {
    int end=0,farthest=0,jump=0,n=nums.length;
    for(int i=0;i<n-1;i++){
        farthest=Math.max(farthest,i+nums[i]);
        if(i==end){
            jump++;
            end=farthest;
        }
    }
    return jump;
}}