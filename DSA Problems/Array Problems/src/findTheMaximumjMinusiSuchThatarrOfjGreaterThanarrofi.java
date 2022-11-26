import java.util.Arrays;

import javax.swing.text.AbstractWriter;

public class findTheMaximumjMinusiSuchThatarrOfjGreaterThanarrofi {
    /*
     * arr[] = {5,4,1,7,2,8,6,3,4}
     * i=0 j=arr.lenght-1
     * find prefixmin of i and postfixmax of j of each element
     * prefixmin = {5,4,1,1,1,1,1,1,1}
     * postfixmax = {8,8,8,8,8,8,6,4,4}
     * now let j= 0 and point at postfixmax
     * now let i= 0 and point at prefixmin
     * int ans
     * while (i|j <arr.length)
     * if(postfix[j]>prefix[i]){
     * ans = Math.max{ans,j-i}
     * j++
     * }else{
     * i++
     * }
     */
    public static void main(String[] args) {
        int arr[] = {6, 5, 4, 3, 2, 1};
        int[] rightmax = new int[arr.length];
        int[] leftmin = new int[arr.length];
        leftmin[0] = arr[0];
        rightmax[arr.length-1]= arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            leftmin[i]=Math.min(leftmin[i-1],arr[i]);
        }
        for(int i=arr.length-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);
        }
        int i=0,j=0,answer=0;
        while(i<arr.length&&j<arr.length){
            if(rightmax[j]>leftmin[i]){
                answer = Math.max(answer, j-i);
                j++;
            }else{
                i++;
            }
        }
        System.out.println(answer);
    }
    
}
