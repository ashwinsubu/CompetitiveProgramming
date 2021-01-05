package hackerrank.virtualcareerfair20;

import java.util.*;

public class Divisors {
//encryptionValidity problem
	public static void main(String[] args) {
		int arr[] = {3,2,2,1,4,5,8,10,12, 48,48};
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(map);
		int maxcount=0;
		for(int i: map.keySet()) {
			int ct= map.get(i);
			for(int k : map.keySet()) {
				if(i >= 2*k) {
					if(i%k==0) {
					ct+=map.get(k);
					}
				}  else {
					break;
				}
			}
			maxcount = Math.max(maxcount, ct);
		}
		System.out.println("mxct="+maxcount);
	}

}
