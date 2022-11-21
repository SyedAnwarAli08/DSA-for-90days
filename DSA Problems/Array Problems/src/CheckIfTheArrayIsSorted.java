import java.util.Arrays;

public class CheckIfTheArrayIsSorted {
    public static void main(String[] args) {
        int[] arr ={80,76,3,4,6,7,4,3,4,56,5,544,3,54,3,3,3,4,5,6,65,4,6};
        Arrays.sort(arr);
        boolean sorted =true;
        for (int i=1;i< arr.length;i++){
            if(arr[i]<arr[i-1]){
                sorted =false;
                break;
            }
        }
        if (sorted){
            System.out.println("the array is sorted");
        }else{
            System.out.println("this array is not sorted");
        }
    }
}
