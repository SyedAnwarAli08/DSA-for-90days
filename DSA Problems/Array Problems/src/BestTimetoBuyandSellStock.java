public class BestTimetoBuyandSellStock{
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int b=0,maxprofit=0;
        for(int current =1;current<prices.length;current++){
            if(prices[b]>prices[current]){
                b = current;
            }else{
                maxprofit=Math.max(maxprofit, prices[current]-prices[b]);
            }
        }System.out.println(maxprofit);
    }
}