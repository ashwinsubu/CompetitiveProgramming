import java.util.Scanner;

public class FairDivision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while(tests>0) {
			tests--;
			int n=sc.nextInt();
			int one=0, two=0;
			for(int i=0; i<n; i++) {
				int x = sc.nextInt();
				if(x == 1) {
					one++;
				} else {
					two++;
				}
			}
//			System.out.println("one:"+one+", two:"+two);
			
			if(one % 2 == 1) {
				System.out.println("NO");
				continue;
			}
			if(one == 0 && two%2 == 1) {
				System.out.println("NO");
				continue;
			}
			System.out.println("YES");
		}
		sc.close();
		
		
	}

}
