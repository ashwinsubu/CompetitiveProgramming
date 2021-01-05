package hackerRankForACause2020;

import java.math.BigDecimal;
import java.math.BigInteger;

public class StringDivisibleBy15 {
	
	public static int checkCholera(String numA, String numB) {
	    // Write your code here
	        String num = numA;
	        int ct=0;
	        while(!num.equals(numB)){
	            if(isDivisible(num)){
	                ct = (ct + 1)%((int)Math.pow(10,9)+7);
	            }
	            num = new BigDecimal(num).add(BigDecimal.ONE).toString();
	        }
	        return ct;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numA= "123456789";	//inclusive
		String numB= "987654321";	//exclusive
		int i=0;
		for(i=0; i<numA.length(); i++) {
			if(numA.charAt(i) != numB.charAt(i)) break;
		}
		System.out.println("i:"+i);
		System.out.println(choleraCount(numA.substring(i), numB.substring(i)));
	}
	//15, 61
	static int choleraCount(String numA, String numB) {
		BigInteger numa = new BigInteger(numA);
		BigInteger numb = new BigInteger(numB);
		BigInteger divisor = new BigInteger("15");
		BigInteger count = numb.divide(divisor).subtract(numa.divide(divisor));
		String numericString = Integer.toString((int) (Math.pow(10, 9)+7));
		
		int total = count.mod(new BigInteger(numericString)).intValue();
		
		if(numa.mod(divisor).intValue() == 0) total+=1;
		
		if(numb.mod(divisor).intValue() == 0) total-=1;
		
		return total;
	}
	
	 public static boolean isDivisible(String S) 
	 { 
	     // length of string 
	     int n = S.length(); 
	       
	     // check divisibility by 5 
	     if (S.charAt(n - 1) != '5' &&  S.charAt(n - 1) != '0') 
	         return false; 
	           
	     // Sum of digits 
	     int sum = 0; 
	     for(int i = 0; i < S.length(); i++) 
	         sum += (int)S.charAt(i); 
	           
	         // if divisible by 3 
	         if(sum % 3 == 0) 
	             return true; 
	         else
	             return false; 
	 }

}
