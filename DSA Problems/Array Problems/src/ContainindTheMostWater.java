public class ContainindTheMostWater {
    public static void main(String[] args){
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int leftPointer=0,rightPointer= arr.length-1;
        int maxValue=0;
        while(leftPointer!=rightPointer){
            int minHeight =Math.min(arr[leftPointer],arr[rightPointer]);
            int distance =rightPointer-leftPointer;
            //the below is the formula for this problem
            maxValue=Math.max(maxValue,minHeight*distance);
            if(arr[leftPointer]>arr[rightPointer]){
                rightPointer--;
            } else {
                leftPointer++;
            }
        }
        System.out.println(maxValue);

    // the below program is written ny me which is more complecated and take more numbr of calculations
//    {
//        int[] arr = {1,8,6,2,5,4,8,3,7};
//        int p1=0,p2=1,maxValue=0;
//        int currentSmallestHeight=0;
//        if (arr[p1]<arr[p2]&&(p1*(Math.abs(p1-p2)))>maxValue){
//            maxValue=arr[p1]*(Math.abs(p1-p2));
//            currentSmallestHeight=p1;
//        }else {
//            maxValue=arr[p2]*(Math.abs(p1-p2));
//            currentSmallestHeight=p2;
//        }
//        int maxforp1,maxforp2;
//        for (int i=2;i< arr.length;i++){
//            if(arr[i]>arr[p1]){
//                 maxforp1=arr[p1]*(Math.abs(p1-i));
//            } else {
//                maxforp1=arr[i]*(Math.abs(p1-i));
//            }
//            if(arr[i]>arr[p2]){
//                maxforp2=arr[p2]*(Math.abs(p2-i));
//            } else {
//                maxforp2=arr[i]*(Math.abs(p2-i));
//            }
//            if(maxforp1>maxforp2&&maxforp1>maxValue){
//                maxValue=maxforp1;
//                p2=i;
//            } else if (maxforp2>maxforp1&&maxforp2>maxValue) {
//                maxValue=maxforp2;
//                p1=p2;
//                p2=i;
//            }
//
//        }
//        System.out.println(maxValue);
//    }
}
}
