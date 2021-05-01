import java.util.Scanner;

public class RedAndBlueBeans {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0){
            long r = in.nextLong();
            long b = in.nextLong();
            long d = in.nextLong();
            if(d==0 && r!=b){
                System.out.println("NO");
                t--;
                continue;
            }
            if(d==0 && r==b){
                System.out.println("YES");
                t--;
                continue;
            }
            long min,max;
            if(r<b) {
                min = r;
                max = b;
            } else {
                min=b;
                max = r;
            }
            if(min*(1+d) >= max){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        in.close();
    }
}
