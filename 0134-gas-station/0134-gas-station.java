class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length,position=0,sum=0,total=0;
        for(int i=0;i<n;i++){
            sum+=gas[i]-cost[i];
            if(sum<0){
                total+=sum;
                sum=0;
                position=i+1;
            }
        }
        total+=sum;
        return total>=0?position:-1;
    }
}