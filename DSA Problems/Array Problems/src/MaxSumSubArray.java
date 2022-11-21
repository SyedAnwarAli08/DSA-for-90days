public class MaxSumSubArray {
    public static void main(String[] args) {
        //this is called kadens algorithm
        int[] arr = {6,-7,4,-2,1,5,-4};
        int maxSubValue=Integer.MIN_VALUE;
        for (int currentElement =0,currentMaxValue=0;currentElement< arr.length;currentElement++){
            currentMaxValue += arr[currentElement];
            if (currentMaxValue>maxSubValue){
                maxSubValue=currentMaxValue;
            }
            if(currentMaxValue<0){
                currentMaxValue=0;
            }
        }
        System.out.println("MaxSubValuee = "+maxSubValue);
    }
}
