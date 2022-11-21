public class LargetELEMENTINARRAY {
    public static void main(String[] args) {
        int a[] ={4,1,7,2,3};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
