public class ThirdLargestElement {
    public static void main(String[] args) {
        int max1=0,max2=-1,max3=-1;
        int[] arr ={80,76,3,4,6,7,4,3,4,56,5,544,3,54,3,3,3,4,5,6,65,4,6};
        for (int i=1;i<arr.length;i++){
           if(arr[i]>arr[max1]){
               max3=max2;
               max2=max1;
               max1=i;
           }else if(max2<0||arr[i]>arr[max2]){
               max3=max2;
               max2=i;
           }else if(max3<0||arr[i]>arr[max3]){
               max3=i;
           }
        }
        System.out.println("max3 = "+arr[max3]);
    }
}
