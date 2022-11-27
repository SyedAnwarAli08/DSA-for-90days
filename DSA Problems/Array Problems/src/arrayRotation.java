import java.util.Arrays;

public class arrayRotation {
    /*
     * Given an array of integers arr[] of size N and an 
     * integer, the task is to rotate the array elements
     *  to the left by d positions.
     * Examples:  
     * Input: 
     * arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
     * Output: 3 4 5 6 7 1 2
     * Input: arr[] = {3, 4, 5, 6, 7, 1, 2}, d=2
     * Output: 5 6 7 1 2 3 4
     */

     /*METHOD ONE (REVERSING THE ARRAY IS MOST RECOMENDED AS IT HAVE THE BEST
      *TIME AND SPACE COMPLEXITY AND IT IS EASY TO USE)
      * I will be solving this problem using to different methods:
      * Method 1.reverse the array and the reverse the n-k elements in the start
      * After doing this reverse k elments in the end (T:O(N),S:O(1))
      * Method 2. Simply rotate all the elements of the array one by one
      * Method 3. Using temp arr (T:O(N),S:O(N))
      * Method 4. Block swap algo (T:O(N),S:O(1))
      * Method 5. Juggling algo (T:O(N),S:O(1))

      */
public static void methodOne(int arr[],int k){
    int temp;
    for(int i =0,j=arr.length-1;i<j;i++,j--){
        temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    for(int i=0,j=arr.length-k-1;i<j;i++,j--){
        temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    for(int i=arr.length-k,j=arr.length-1;i<j;i++,j--){
        temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
public static void methodTwo(int[] arr,int k){
    int temp[]=new int[k];
    for(int i=0;i<k;i++){
        temp[i]=arr[i];
    }
for(int i=k,j=0;i<arr.length;i++,j++){
    arr[j]=arr[i];
}
for(int i=arr.length-k,j=0;i<arr.length;i++,j++){
    arr[i]=temp[j];
}
}
      public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // methodOne(arr, 2);
        methodTwo(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
    
}
