public class ElementsInMaximuSubArray {
    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3 };
        int MaxTillNow=Integer.MIN_VALUE;
        int left=0,right=0;
        for(int i=0,startofsubarray=0,currentMax=Integer.MIN_VALUE;i<a.length;i++){
        if(currentMax<=0){
                currentMax=a[i];
                startofsubarray=i;
            }
            else{
                currentMax +=a[i];
            }
            if(currentMax>MaxTillNow){
                MaxTillNow = currentMax;
                left =startofsubarray;
                right =i;
            }

        }
        System.out.println(left);
        System.out.println(right);
        for(;left<right+1;left++){
            System.out.print(a[left]+", ");
        }
    }

}
