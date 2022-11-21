import java.sql.Array;
import java.util.Arrays;

public class DeleteArrayElement {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int key = 6;
        int i=0;
        boolean keynotfound=true;
        for(;i<a.length;i++){
            if(a[i]==key){
                keynotfound=false;
                break;}
        }
        if (keynotfound){
            System.out.println("key not found");
        }else {
            for (int j=i;j<a.length-1;j++){
                a[j]=a[j+1];
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
