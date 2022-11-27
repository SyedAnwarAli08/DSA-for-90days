import java.util.HashMap;
import java.util.Map;
import java.util.function.ToIntBiFunction;
//I will be using Moore’s Voting Algorithm to solve this problem
public class MajorityElement {
     /* 
     Q) IF ANY NUMBER REPEATS MORE THAN N/2 TIMES THEN PRINT IT
     Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4
Explanation: The frequency of 4 is 5 which 
is greater than the half of the size of the array size. 

Input : {3, 3, 4, 2, 4, 4, 2, 4}
Output : No Majority Element
Explanation: There is no element whose frequency is 
greater than the half of the size of the array size. */
/*
 * This problem can be sloved using various methods:
 *1.Majority Element using Binary Search Tree(Time 
 Complexity:O(n²) But if a self-balancing-binary-search 
 tree is used then it will be O(nlogn),Auxiliary Space:O(n))
 *2.Majority Element Using Moore’s Voting Algorithm (This is the best solution among all as its 
 Time Complexity: O(n),Auxiliary Space: O(1))
 *3.Majority Element Using Hashing
 *4.Majority Element Using Sorting
 */
    public static void main(String[] args) {
        int[] arr = {3,3,4,2,4,4,2,4,4};
        int currentMaxIndex = 0;
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[currentMaxIndex]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                currentMaxIndex=i;
                count++;
            }
        }
        //CHECKING IF THE ANSWER IS CORRECT OR NOT
        int checkingAns=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[currentMaxIndex]){
                checkingAns++;
            }
        }
        if(checkingAns>(arr.length/2)){
            System.out.println(arr[currentMaxIndex]+" is the major element");
        }else{
            System.out.println("this is no major element");
        }
    }

}
