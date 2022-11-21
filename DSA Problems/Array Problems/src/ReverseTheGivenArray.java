import java.util.Arrays;

public class ReverseTheGivenArray {
    public static void main(String[] args) {
        int[] arr ={80,76,3,4,6,7,4,3,4,56,5,544,3,54,3,3,3,4,5,6,65,4,6};
        int temp;
        for (int i=0,j= arr.length-1;i!=j;i++,j--){
            temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
