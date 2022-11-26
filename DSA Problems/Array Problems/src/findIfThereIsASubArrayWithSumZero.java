import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findIfThereIsASubArrayWithSumZero{
    public static void main(String[] args) {
        int[] arr = {2,3,1,-4,3,-2};
        int[] prefixsum = new int[arr.length];
        prefixsum[0] = arr[0];
        Set<Integer> myset = new HashSet<>();
        myset.add(arr[0]);
        int count =0;
        for(int i=1;i<arr.length;i++){
            prefixsum[i] = prefixsum[i-1]+arr[i];
            if(myset.contains(prefixsum[i])){
                count++;
            }else{
                myset.add(prefixsum[i]);
            }
        }
        System.out.println(count);

    }
}