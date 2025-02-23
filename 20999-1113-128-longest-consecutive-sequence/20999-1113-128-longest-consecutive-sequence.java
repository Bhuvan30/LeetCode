class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Set<Integer> un=new HashSet<>();
        for(int num:nums){
            un.add(num);
        }
        int mlos=0;
        for(int num:un){
            if(!un.contains(num-1)){
                int clos=1;
                while(un.contains(num+1)){
                    num++;
                    clos++;
                }
                mlos=Math.max(mlos,clos);
            }
        }
        return mlos;
    }
}