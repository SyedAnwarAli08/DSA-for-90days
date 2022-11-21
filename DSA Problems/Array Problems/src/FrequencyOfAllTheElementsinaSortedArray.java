public class FrequencyOfAllTheElementsinaSortedArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,3,3,3,4,4,5,6,6,6,8,9,9,9};
        int count=1;
        for(int i=1;i< arr.length;i++){
            if(arr[i-1]!=arr[i]){
                System.out.println(arr[i-1]+" occured "+count+" times");
                count=1;
            }else {
                count++;
            }
        }
        System.out.println(arr[arr.length-1]+" occured "+count+" times");


    }
}
