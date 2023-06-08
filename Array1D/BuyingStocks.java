package Array1D;

public class BuyingStocks {
    public static int buyingAndSellingStocks(int price[]){
        int MaxProfit = 0;
        int buyingPrice = Integer.MAX_VALUE;

        for(int i=0; i<price.length; i++){
            if(buyingPrice < price[i]){
                int profit = price[i] - buyingPrice;
                MaxProfit = Math.max(profit,MaxProfit); 
            } else{
                buyingPrice = price[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println(buyingAndSellingStocks(price));
    }
}
