import java.util.Scanner;

public class Countdown {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0) {
			t--;
			int n = in.nextInt();
			int arr[] = new int[n];
			String num = in.next();
			for(int i=0; i<n; i++) {
				arr[i] = (int)(num.charAt(i)-'0');
//				System.out.println(arr[i]);
			}
			int ct=0;
//			System.out.println("arr0:"+arr[0]);
			ct = arr[arr.length-1] > 0 ? arr[arr.length-1]: 0;
			for(int i=arr.length-2; i>=0;i--) {
				if(arr[i] > 0) {
					ct+=arr[i]+1;
				}
			}
			System.out.println(ct);
		}
		in.close();
		
	}

}
