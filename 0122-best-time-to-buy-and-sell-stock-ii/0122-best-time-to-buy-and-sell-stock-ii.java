class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        for(int i=0;i<prices.length;i++){
            if(i+1<prices.length){
                if(prices[i]<prices[i+1]){
                    maxp=maxp+(prices[i+1]-prices[i]);
                }
            }
        }
        return maxp;
        
    }
}