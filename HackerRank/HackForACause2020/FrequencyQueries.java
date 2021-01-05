package hackerRankForACause2020;

import java.util.*;

public class RangeFrequencyQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n----test1");
		test1();
		System.out.println("\n----test2");
		test2(); 
		System.out.println("\n----test3");
		test3();
	}

	public static List<Integer> frequencyQueries1(List<Integer> arr, int k, List<List<Integer>> queries){
		Map<Integer, Integer> freq = new HashMap<>();
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=0; i<arr.size(); i++) {
			freq.put(arr.get(i), freq.getOrDefault(arr.get(i), 0)+1);
		}
		int len = arr.size();
		for(List<Integer> query: queries) {
			int start=query.get(0);
			int end = query.get(1);
			int x = query.get(2);
			if(!freq.containsKey(x)) {
				result.add(0);
				continue;
			}
			int modStart = start%len, nextStart = start, nextEnd = end, modEnd = (1+end)%len;
			if(modStart > 0) nextStart = start + len - modStart;
			if(modEnd > 0) nextEnd = end - modEnd;
			
			
			int count = (1+nextEnd - nextStart);
			count/=len;
			count *= freq.get(x);
			if(modEnd > 0) {
				for(int i=0; i<modEnd; i++) {
					if(arr.get(i) == x) count++;
				}
			}
			if(modStart > 0) { 
				for(int i=modStart; i<len; i++) {
					if(arr.get(i) == x) count++;
				}
			}
			
			
			System.out.println(start+" to "+end+" ("+x+") count is "+ count);
			System.out.println();
			result.add(count);
		}
		return result;
	}
	
	static void test1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(8);list.add(9);list.add(3);
		List<List<Integer>> q = new ArrayList<List<Integer>>();
		List<Integer> l = new ArrayList<Integer>();
		l.add(0);l.add(11);l.add(9);
		q.add(l);
		
		l = new ArrayList<Integer>();
		l.add(6);l.add(9);l.add(4);
		q.add(l);
		frequencyQueries1(list, 4, q);
	}
	static void test2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);list.add(2);list.add(2);
		List<List<Integer>> q = new ArrayList<List<Integer>>();
		List<Integer> l = new ArrayList<Integer>();
		l.add(4);l.add(15);l.add(2);
		q.add(l);
		
		l = new ArrayList<Integer>();
		l.add(4);l.add(14);l.add(2);
		q.add(l);
		
		l = new ArrayList<Integer>();
		l.add(3);l.add(14);l.add(2);
		q.add(l);
		
		l = new ArrayList<Integer>();
		l.add(2);l.add(14);l.add(2);
		q.add(l);

		l = new ArrayList<Integer>();
		l.add(2);l.add(13);l.add(2);
		q.add(l);
		frequencyQueries1(list, 4, q);
	}
	static void test3() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(3);list.add(2); list.add(5);
		List<List<Integer>> q = new ArrayList<List<Integer>>();
		List<Integer> l = new ArrayList<Integer>();
		l.add(0);l.add(1);l.add(1);
		q.add(l);
		
		l = new ArrayList<Integer>();
		l.add(1);l.add(5);l.add(3);
		q.add(l);
		
		l = new ArrayList<Integer>();
		l.add(1);l.add(9);l.add(2);
		q.add(l);
		
		l = new ArrayList<Integer>();
		l.add(6);l.add(9);l.add(2);
		q.add(l);
		
		List<Integer> ls  = frequencyQueries1(list, 3, q);
		System.out.println(ls);
	}
}
