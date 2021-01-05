import java.util.*;

public class Donations {

	public static void main(String[] args) {
		test1();
		test2();
	}
	public static long numberOfWays(List<Integer> donationsA, List<Integer> donationsB, List<Integer> donationsC, List<Integer> donationsD, int K) {
		Collections.sort(donationsA);
	    Collections.sort(donationsB);
	    Collections.sort(donationsC);
	    Collections.sort(donationsD);
	    long ct=0;
	    for(int i=0; i<donationsA.size(); i++) {
	    	int suma  = donationsA.get(i);
	    	for(int j=0; j<donationsB.size(); j++) {
	    		int sumb = donationsB.get(j);
	    		for(int k=0; k<donationsC.size(); k++) {
	    			int sumc = donationsC.get(k);
	    			int target = K - (suma+sumb+sumc);			
	    			for(int l=0; l<donationsD.size(); l++) {
	    				int sumd = donationsD.get(l);
	    				if(suma +sumb + sumc +sumd>= K) {
				    		ct += (donationsD.size() - l);
				    		ct += (donationsA.size() - i) * (donationsB.size() - j) * (donationsC.size() - k) * donationsD.siz
							break;
	    				}
	    		    }
	    	    }
		    }
	    }
		return ct;
	}
	
	static void test1() {
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		List<Integer> c = new ArrayList<>();
		List<Integer> d = new ArrayList<>();
		a.add(2);a.add(10);
		b.add(3);
		c.add(10);c.add(12);c.add(7);
		d.add(5);d.add(8);
		int  k = 25;
		System.out.println("test1:"+numberOfWays(a, b, d, c, k));
	}
	static void test2() {
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		List<Integer> c = new ArrayList<>();
		List<Integer> d = new ArrayList<>();
		a.add(2);a.add(10);
		b.add(3);
		c.add(10);c.add(12);c.add(7);
		d.add(5);d.add(8);
		int  k = 100;
		System.out.println("test2:"+numberOfWays(a, b, d, c, k));
	}

}
