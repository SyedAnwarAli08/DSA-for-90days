import java.util.Arrays;
public class splitArrayInThreeEqualSumSubarrays {
    public static int findEqualSubArrays(int[] arr){
        int S=arr[0];
        int p1=-1,p2=-1;
        for(int i=1;i<arr.length;i++){
            S+=arr[i];
        }
        if(S%3!=0){
            return -1;
        }
        int S1 =S/3;
        int S2 =2*(S1);
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum +=arr[i];
            if(currentSum==S1 && p1==-1){
                p1 =i;
            }else if(currentSum==S2 && p1!=-1){
                p2 =i;
            }
            if(p1!=-1&&p2!=-1){
                System.out.println(p1);
                System.out.println(p2);
                return 1;
            }
        }
        return -1;
        // int Sum = 0;
        // for(int i=0;i<arr.length;i++){
        //     Sum += arr[i];
        // }
        // if(Sum%3!=0){
        //     return -1;
        // }
        // int eachSubArrayValueShouldBe=Sum/3;
        // int[] firstSubArray = new int[2];
        // int[] secondSubArray = new int[2];
        // int[] thiirdSubArray = new int[2];
        // int currentTotal=0;
        // int i=0;
        // firstSubArray[0]=i;
        // for(;i<arr.length;i++){
        //     currentTotal += arr[i];
        //     if(currentTotal==eachSubArrayValueShouldBe){
        //         firstSubArray[1]=i;
        //         i++;
        //         break;
        //     } else if(currentTotal>4){
        //         return -1;
        //     }
        // }
        // currentTotal=0;
        // secondSubArray[0]=i;
        // for(;i<arr.length;i++){
        //     currentTotal += arr[i];
        //     if(currentTotal==eachSubArrayValueShouldBe){
        //         secondSubArray[1]=i;
        //         i++;
        //         break;
        //     } else if(currentTotal>4){
        //         return -1;
        //     }
        // }
        // currentTotal=0;
        // thiirdSubArray[0]=i;
        // for(;i<arr.length;i++){
        //     currentTotal += arr[i];
        //     if(currentTotal==eachSubArrayValueShouldBe){
        //         thiirdSubArray[1]=i;
        //         break;
        //     } else if(currentTotal>4){
        //         return -1;
        //     }
        // }
        // System.out.println(Arrays.toString(firstSubArray));
        // System.out.println(Arrays.toString(secondSubArray));
        // System.out.println(Arrays.toString(thiirdSubArray));
        // return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 0, 4};
        System.out.println(findEqualSubArrays(arr));;
    }
}
