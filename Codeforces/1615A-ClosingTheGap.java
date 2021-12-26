import java.util.Scanner;

public class ClosingTheGap_1615A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while(tests>0) {
			int n = sc.nextInt();
			int sum = 0;
			for(int i=0; i<n; i++) {
				sum += sc.nextInt();
			}
			if(sum%n == 0) System.out.println(0);
			else System.out.println(1);
			tests--;
		}
		sc.close();
	}

}
