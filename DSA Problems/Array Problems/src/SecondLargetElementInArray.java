public class SecondLargetElementInArray {
    public static void main(String[] args) {
        int[] arr ={7,2,1,6,50};
        if(arr.length>1){
        int maxindex=0,secmaxindex=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[maxindex]<arr[i]){
                secmaxindex=maxindex;
                maxindex=i;
            }else if (secmaxindex==-1||arr[i]>arr[secmaxindex]){
                secmaxindex = i;
            }
        }
        System.out.println(arr[secmaxindex]);}
        else {
            System.out.println("invaid output");
        }

    }
}
