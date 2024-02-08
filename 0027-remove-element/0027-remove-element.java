class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val && nums[j]==val){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            if(nums[j]!=val){
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return j;
        
    }
}