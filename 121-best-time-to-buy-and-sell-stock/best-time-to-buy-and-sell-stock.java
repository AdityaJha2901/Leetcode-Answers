class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int CP = Integer.MAX_VALUE;
        int ith = 0;
        // int SP = Integer.MIN_VALUE;
        for(int i = 0; i<prices.length ; i++){
            if(prices[i]<CP){
                CP = prices[i];
                
              
                // SP = 0;
                
            //     for(int j = i; j<prices.length; j++){
                
            //         if(SP<prices[j]){
            //             SP = prices[j];
            //         }      
            //     }
            }
            profit = Math.max(profit, prices[i]-CP);
        }    
        
               
        return profit;
        
    }
}