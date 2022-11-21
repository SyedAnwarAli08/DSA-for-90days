public class FindTheSallestElementInAnArray {
    public static void main(String[] args) {
        int[] arr ={34,76,3,4,6,7,4,3,4,56,5,544,3,54,3,3,3,4,5,6,65,4,6};
        int min =Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++){
            if(arr[i]<min){
                min =arr[i];
            }
        }
        System.out.println(min);

    }
}
