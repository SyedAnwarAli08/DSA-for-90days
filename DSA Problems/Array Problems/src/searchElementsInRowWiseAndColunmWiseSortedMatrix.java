import java.sql.PseudoColumnUsage;

import javax.lang.model.util.ElementScanner14;

public class searchElementsInRowWiseAndColunmWiseSortedMatrix {
public static boolean findTheElement(int arr[][],int key){
    int row =0,col=arr.length-1;
    while(row<arr.length&&col>=0){
        if(arr[row][col]==key){
            return true;
        }else if(arr[row][col]>key){
            col--;
        }else{
            row++;
        }
    }
    return false;
}
    public static void main(String[] args) {
    int[][] arr = {{10, 20, 30, 40},
    {15, 25, 35, 45},
    {27, 29, 37, 48},
  {32, 33, 39, 50}};
  System.out.println(findTheElement(arr, 100));
}
    
}
