package hackerRankForACause2020;

import java.util.*;

public class MaximumMinimum {

	public static List<Integer> maximumMinimum(List<Integer> donations, List<Integer> handouts) {
	    int max1 = Collections.max(donations), min1 = Collections.max(handouts), max2 = Collections.min(donations), min2 = Collections.min(handouts);
	    
	    ArrayList<Integer> ans = new ArrayList<>();
	    int m1 = max1+min1, m2 = max2+min2;
	    ans.add(m1); ans.add(m2);
	    
	    return ans;
	}
}
