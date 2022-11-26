import java.util.Arrays;

public class transposeOfAMatrix{
    public static void main(String[] args) {
        //this is a square matrix
        /*
         * [0,0][0,1][0,2]
         * [1,0][1,1][1,2]
         * [2,0][2,1][2,2]
         * This is how a 2dmatrix look like and 
         * [0,0]... are the indexes of the matrix
         */
        //this is a O(N^2) solution
        int[][] myMatrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for(int i=0;i<myMatrix.length;i++){
            int temp;
            for(int j=i;j<myMatrix.length;j++){
                temp = myMatrix[i][j];
                myMatrix[i][j]=myMatrix[j][i];
                myMatrix[j][i]=temp;
            }
        }
        System.out.println(Arrays.toString(myMatrix[0]));
        System.out.println(Arrays.toString(myMatrix[1]));
        System.out.println(Arrays.toString(myMatrix[2]));
    
    }
}