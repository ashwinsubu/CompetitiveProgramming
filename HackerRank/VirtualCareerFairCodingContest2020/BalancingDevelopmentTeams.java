package hackerrank.virtualcareerfair20;

import java.util.*;

public class BalancingDevelopmentTeams {
//  7/15 test cases
//max balanced teams
	public static void main(String[] args) {
//		int []developers = new int[] {12,8,4,1};
		List<Integer> developers = new ArrayList<>();
//		developers.add(12);developers.add(8);developers.add(4);developers.add(1);
//		int maxNewHires=2;
//		developers.add(18);developers.add(12);developers.add(9);
//		developers.add(14);developers.add(3);developers.add(2);
//		developers.add(4);developers.add(23);developers.add(33);
//		developers.add(22);developers.add(11);
//		int maxNewHires=4;
		developers.add(108);developers.add(5);developers.add(3);
		developers.add(2);developers.add(1);
		int maxNewHires=10007;
		HashMap<Integer,Integer> countmap = new HashMap<>();
		int finalcount = 0;
		Collections.sort(developers, Collections.reverseOrder());
		for(int dev: developers) {
			countmap.put(dev, countmap.getOrDefault(dev, 0)+1);
		}
		int mx=0;
		for(int key: countmap.keySet()) {
			mx=Math.max(mx, countmap.get(key));
		}
		List<Integer> maxList = new ArrayList<>();
		for(int key: countmap.keySet()) {
			if(countmap.get(key) == mx)
				maxList.add(key);
		}
		Collections.sort(maxList, Collections.reverseOrder());
		System.out.println("maxlist:"+maxList);
		for(int ele: maxList) {
			int ct = countmap.get(ele);	//initial count
			int hires = maxNewHires;
			int j = developers.lastIndexOf(ele);
			System.out.println("ele:"+ele+", d[j]:"+developers.get(j)+", j:"+j);
			for(;j<developers.size();j++) {
				if(developers.get(j) == ele) continue;
				if((hires+developers.get(j)) >= ele) {
					int d = ele - developers.get(j);
					hires-=d;
					ct++;
				}
			}
			finalcount=Math.max(finalcount, ct);
		}
		System.out.println("ans:"+finalcount);
	}

}
