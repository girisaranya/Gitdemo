
public class PallendromeorNot {
	
	public static void main (String args[]) {
		
		String str="12121";
		char ch;
		String rev="";
		System.out.println(str);
		for(int i=0;i<str.length();i++) {
			ch= str.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
		
		if(str.contentEquals(rev))
			
			System.out.println("Pallendrome");
		else
			System.out.println("not Pallendrome");
			
		}
	}


