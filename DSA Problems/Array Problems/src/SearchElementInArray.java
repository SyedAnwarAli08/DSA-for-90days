public class SearchElementInArray {
    public static void main(String[] args) {
        int a[] ={2,1,4,6,5};
        int key=6;
        boolean flag=false;
                for(int i=0;i<a.length;i++){
                    if(a[i]==key){
                        flag=true;
                        break;
                    }
                }
                if (flag==true){
                    System.out.println("Hacked By Rehan");
                }else {
                    System.out.println("key not found");
                }
    }
}
