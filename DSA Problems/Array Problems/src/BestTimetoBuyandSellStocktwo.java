public class BestTimetoBuyandSellStocktwo {
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        int b=0,maxprofit=0;
        for(int current =1;current<prices.length&&b<prices.length;current++){
            if(prices[b]>prices[current]){
                b = current;
            }else{
                maxprofit+= prices[current]-prices[b];
                b++;
            }
        }
        System.out.println(maxprofit);
    }
}
