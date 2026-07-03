class Solution {
    public int maxProfit(int[] prices) {
        int buy_day=0;
        int sell_day=1;
        int profit=0;
        while(sell_day<prices.length){
            if(prices[sell_day]>prices[buy_day]){
                profit=Math.max(profit,prices[sell_day]-prices[buy_day]);
                sell_day++;
            }
            else{
                // my wrong is i did  buy_day++;
                // look this example [1,2,4,2,5,7,2,4,9,0,9]
                buy_day=sell_day;
                sell_day++;
            }
            

        }
        return profit;
        
    }
}
