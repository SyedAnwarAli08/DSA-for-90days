import java.util.Arrays;
public class rotateAMatrixNintyDegreeClockwise {
    public static void main(String[] args) {
        int[][] myMatrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        //to solve this problem first transpose the
        //matrix and then swap first colunm with 
        //last and 2nd with last 2nd and so on
        for(int i=0;i<myMatrix.length;i++){
            int temp;
            for(int j=i;j<myMatrix.length;j++){
                temp = myMatrix[i][j];
                myMatrix[i][j]=myMatrix[j][i];
                myMatrix[j][i]=temp;
            }
        }
        for(int currentRow=0;currentRow<myMatrix.length;currentRow++){
            int temp;
            for(int i=0,j=myMatrix.length-1;i!=j;i++,j--){
                temp=myMatrix[currentRow][i];
                myMatrix[currentRow][i]=myMatrix[currentRow][j];
                myMatrix[currentRow][j]= temp;
            }
        }
        System.out.println(Arrays.toString(myMatrix[0]));
        System.out.println(Arrays.toString(myMatrix[1]));
        System.out.println(Arrays.toString(myMatrix[2]));
        
    }    
}
