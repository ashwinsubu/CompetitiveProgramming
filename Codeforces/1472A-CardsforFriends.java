import java.util.Scanner;

public class CadsforFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while(tests>0) {
			tests--;
			int x = sc.nextInt();
			int y = sc.nextInt();
			int n = sc.nextInt();
			if(n == 1) {
				System.out.println("YES");
				continue;
			}
			int count=0;
			if(x%2 == 0) {
				int xp = Integer.lowestOneBit(x);
//				double p =  Math.log(xp)/Math.log(2);
				count+=xp;
			} 
			int ct2=0;
			if(y%2 == 0) {
				int yp = Integer.lowestOneBit(y);
//				double p =  Math.log(yp)/Math.log(2);
				ct2+=yp;
			}
			if(ct2 == 0 && count >=n ) {
				System.out.println("YES");
				continue;
			}
			if(ct2 >= n && count == 0 ) {
				System.out.println("YES");
				continue;
			}
			if(count*ct2 >= n) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
//			System.out.println("count:"+count+", ct2:"+ct2);
		}
		sc.close();
//		int x = Integer.highestOneBit(34);
//		System.out.println(x);
//		double p =  Math.log(x)/Math.log(2);
//		System.out.println(p);
////		System.out.println(Math.log(24)/Math.log(2));
//		System.out.println(Integer.lowestOneBit(40));
//		System.out.println(Integer.lowestOneBit(24));
//		System.out.println(Integer.lowestOneBit(80));
//		System.out.println(Math.log(8)/Math.log(2));
//		System.out.println(Integer.lowestOneBit(80));
		
	}

}
