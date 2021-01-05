package hackerrank.virtualcareerfair20;

import java.util.*;

public class PackagingConstraints {

	public static void main(String[] args) {
		int size[] = {2,5,7,6,9,8,4,2}; //testcases
//		int size[] = {108,5,4,3,2,1};
//		int size[] = {108,2,2,2,2,1};
//		int size[] = {100,99};
		for(int i=0;i<size.length;i++) size[i]*=-1;
		Arrays.sort(size);
		for(int i=0;i<size.length;i++) size[i]*=-1;
		
		int l=0;
		int mid = size[0]/2;
		int p;
		for(p=size.length-1; p>=0; p--) {
			if(size[p]>mid) {
				p++;
				break;
			}
		}
//		System.out.println("ind:"+p+", closest:"+size[p]);
		int r=p;
		HashSet<Integer> set = new HashSet<>();
		int count=0;
		while(r<size.length) {
			if(set.contains(l)) {
				l++; continue;
			}
			if(set.contains(r)) {
				r++; continue;
			}
			if(size[l] >= 2*size[r]) {
				count++;
				set.add(l); set.add(r);
				l++; r++;
			} else {
				r++;
			}
		}
		System.out.println("count:"+count);
		
	}

}
