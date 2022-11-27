public class minimumAndMaximumElement {
    public static void main(String[] args) {
        long[] a = {3, 2, 1, 56, 10000, 167};
        long n=6;
        long min =Integer.MAX_VALUE;
        long max =Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            max=Math.max(max, a[i]);
            min = Math.min(min,a[i]);

        }
    }
}
