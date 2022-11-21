import java.util.Arrays;

public class MoveAllOsToTheEnd {
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        int left=0,right=0,temp;
       while(right!=arr.length){
           if(arr[right]!=0&&arr[left]==0){
               temp=arr[right];
               arr[right]=arr[left];
               arr[left]=temp;
               left++;
               right++;
           }
           else if(arr[left]==0){
               right++;
           }
       }
        System.out.println(Arrays.toString(arr));
    }
}
