import java.util.Scanner;

public class TheCakeisALie {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int x1 =1 , y1=1;
            int xy = (n-x1) + n*(m-1);
            int yx = (m-y1) + m*(n-1);
            int min = Math.min(xy,yx);

            if(min == k){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }

    }
}
