import java.util.HashSet;
import java.util.Scanner;

public class BovineDilemma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while(tests>1) {
			tests--;
			int size = sc.nextInt();
			int arr[] = new int[size];
			for(int i=0;i<size; i++) {
				arr[i] = sc.nextInt();
			}
			set = new HashSet<>();
			findAllSums(arr);
			System.out.println(set.size());
		}
		sc.close();
	}
	static HashSet<Integer> set;
	static void findAllSums(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int diff = arr[j]-arr[i];
				set.add(diff);
			}
		}
	}

}
