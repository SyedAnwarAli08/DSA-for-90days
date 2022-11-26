import java.sql.PseudoColumnUsage;
import java.util.Arrays;

public class findTheLargestSubarrayWithEqualNumbersOfZerosAndOnes {

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1, 0, 0};
        int[] numberOfZeros = new int[arr.length];
        int[] numberOfOnes = new int[arr.length];
        if(arr[arr.length-1]==0){
            numberOfZeros[arr.length-1]=1;
        }else{
            numberOfZeros[arr.length-1]=1;
        }
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]==0){
                numberOfZeros[i]= numberOfZeros[i+1]+1;
                numberOfOnes[i]=numberOfOnes[i+1];
            }else{
                numberOfOnes[i]=numberOfOnes[i+1]+1;
                numberOfZeros[i]=numberOfZeros[i+1];
            }
        }
    }
    
}
