import java.util.Scanner;

public class LongJumps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while(tests>0) {
			tests--;
			int n = sc.nextInt();
			int arr[] = new int[n+1];
			for(int i=1; i<n+1; i++) {
				arr[i] =sc.nextInt();
			}
			int index[] = new int[n+1];
			int max = 0;
			for(int i=1; i<n+1; i++) {
				int curr = i;
				int points=0;
				while(curr < n+1) {
					if(index[curr] > 0) break;
					points+=arr[curr];
					index[curr] = curr + arr[i];
					curr += arr[curr];
				}
				max = Math.max(max, points);
			}
			System.out.println(max);
		}
		sc.close();
		
	}

}
