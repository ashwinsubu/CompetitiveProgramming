import java.util.Scanner;

public class MaximumSumOfProducts {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }
        long initialTotal = 0;
        for(int i=0; i<n; i++){
            b[i] = in.nextInt();
            initialTotal += (long)a[i]*b[i];
        }
        //odd length sub arrays starting from index 1
        long max = initialTotal;
        for(int i=1; i<n-1; i++) {
            long total = initialTotal;
            int l = i-1, r= i+1;
            while(l>=0 && r<n){
                long subtract = (long)a[l]*b[l] + (long)a[r]*b[r];
                long add = (long)a[l]*b[r] + (long)a[r]*b[l];
                total = total - subtract + add;
                max = Math.max(total, max);
                l--; r++;
            }
        }
        //even length sub arrays starting from index 0
        for(int i=0; i<n-1; i++) {
            long total = initialTotal;
            int l = i, r= i+1;
            while(l>=0 && r<n){
                long subtract = (long)a[l]*b[l] + (long)a[r]*b[r];
                long add = (long)a[l]*b[r] + (long)a[r]*b[l];
                total = total - subtract + add;
                max = Math.max(total, max);
                l--; r++;
            }
        }
        System.out.println(max);
    }
}
