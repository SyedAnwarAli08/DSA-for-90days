public class minSumSubArray {
/*
 * FOR REVISION
 * smallestSumSubarr(arr, n)
    Initialize min_ending_here = INT_MAX
    Initialize min_so_far = INT_MAX
    
    for i = 0 to n-1
        if min_ending_here > 0
            min_ending_here = arr[i]        
        else
            min_ending_here += arr[i]
        min_so_far = min(min_so_far, min_ending_here)

    return min_so_far
 * 
 */


    public static void main(String[] args) {
        int arr[] ={3, -4, 2, -3, -1, 7, -5};
        int MinimumTillNow=Integer.MAX_VALUE;
        for(int i=0,currentValue=Integer.MAX_VALUE;i<arr.length;i++){
               if(currentValue>0){
                currentValue = arr[i];
               } else{
                currentValue+=arr[i];
               }
               MinimumTillNow = Math.min(MinimumTillNow, currentValue);
        }
System.out.println(MinimumTillNow);
    }
}
