import java.sql.Array;
import java.util.Arrays;
//given {2,2,3,4,4,7}
/*i=0,j=1
* if a[i]==a[j]then{
*
* }
* */

public class RemoveDuplicateFromASortedArray {

    public static void main(String[] args) {
        int[] arr ={2,2,3,4,4,7};
        int[] newarr = new int[arr.length];
        newarr[0] = arr[0];
        for(int index =1,tobeadded=1;tobeadded< arr.length;tobeadded++){
            if (arr[tobeadded]!=arr[index-1]){
                arr[index]=arr[tobeadded];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
