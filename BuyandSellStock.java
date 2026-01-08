//using my own approach with some modifications and repairarance

class BuyandSellStock{
    static int maxProfit(int[] prices) {
        int minprice = prices[0];
        int maxprofit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            }else{
                maxprofit = Math.max(maxprofit, prices[i] - minprice);
            }
        }
        return maxprofit;
    }
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        int output = maxProfit(prices);
        System.out.println(output);
    }
}