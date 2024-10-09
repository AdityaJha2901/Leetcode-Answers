class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int CP = Integer.MAX_VALUE;
        int SP = Integer.MIN_VALUE;
        for(int i = 0; i<prices.length-1 ; i++){
            if(prices[i]<CP){
                CP = prices[i];
                SP = 0;
                
                for(int j = i; j<prices.length; j++){
                
                    if(SP<prices[j]){
                        SP = prices[j];
                    }      
                }
            }
            

            if(profit<SP-CP){
                profit = SP-CP;
            }
        }
        return profit;
    }
}