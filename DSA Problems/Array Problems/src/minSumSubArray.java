public class minSumSubArray {
    public static void main(String[] args) {
        int arr[] ={3, -4, 2, -3, -1, 7, -5};
        int totalMin = arr[0];
        int currentMin =totalMin;
        for (int i=1,j=0;i< arr.length;i++){
            if (currentMin+arr[i]>=0){
                System.out.println("currentmain = "+currentMin);
                currentMin=0;
            }
            else {totalMin = Math.min(totalMin,currentMin+arr[i]);
                currentMin += arr[i];
                System.out.println(totalMin);
            }
        }
        System.out.println("Hello world");
        System.out.println(totalMin);
        

    }
}
