package hackerrank.virtualcareerfair20;

public class CountStrings {
	//find all cycles where first and last ele are same
	public static void main(String[] args) {
		String s ="accbb";
//		String s ="abc";
		int l=0, r=s.length()-1,count=0;
		while(l<s.length()) {
			if(s.charAt(l) == s.charAt(r)) {
				count++;
			}
			l++;
			r = (r+1)%s.length();
		}
		System.out.println(count);
	}

}
