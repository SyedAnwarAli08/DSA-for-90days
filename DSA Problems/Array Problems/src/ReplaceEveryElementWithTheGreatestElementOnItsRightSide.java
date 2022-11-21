import java.util.Arrays;

public class ReplaceEveryElementWithTheGreatestElementOnItsRightSide {
    /*Write a program to replace every element with the greatest element on its right side.
Expected Output :
The given array is : 7 5 8 9 6 8 5 7 4 6
After replace the modified arrav is: 9 9 9 8 8 7 7 6 6 0*/
    public static void main(String[] args) {
        int[] arr ={80,76,3,4,6,7,4,3,4,56,5,544,3,54,3,3,3,4,5,6,65,4,6};
        for (int i= arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                arr[i-1]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
