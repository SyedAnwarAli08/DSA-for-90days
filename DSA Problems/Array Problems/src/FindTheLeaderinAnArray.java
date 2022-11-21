import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindTheLeaderinAnArray {
    public static void main(String[] args) {
        int[] arr ={80,76,3,4,6,7,4,3,4,56,5,544,3,54,3,3,3,4,5,6,65,4,6};
        int biggest= arr[arr.length-1];
        System.out.print(biggest+" ");
        for (int i= arr.length-2;i>-1;i--){
            if (arr[i]>biggest){
                biggest=arr[i];
                System.out.print(biggest+" ");
            }
        }
    }
}
