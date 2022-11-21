import java.util.Arrays;

public class rainWater {
    public static void main(String[] args) {

        int[] arr = {1,0,2,1,0,1,3,2,1,2,1};
        int[] biggestFromLeft = new int[arr.length];
        int[] biggestFromRight = new int[arr.length];
        biggestFromLeft[0]=arr[0];
        biggestFromRight[arr.length-1]=arr[arr.length-1];
        for (int i=1;i< arr.length;i++){
                biggestFromLeft[i]= Math.max(arr[i],biggestFromLeft[i-1] );
        }
        for (int i= arr.length-2;i>-1;i--){
            biggestFromRight[i]=Math.max(arr[i],biggestFromRight[i+1]);
        }
        int maxWater=0;
        for(int i=0;i<arr.length;i++){
            maxWater+=Math.min(biggestFromLeft[i],biggestFromRight[i])-arr[i];
        }
        System.out.println(maxWater);
    }
}
