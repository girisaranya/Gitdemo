
public class chacterOccurenceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java";
		int count;
		
		char str1[]=str.toCharArray();
		for(Character ch: str1)
			System.out.println(ch);
		for(int i=0;i<str1.length;i++) {
			 count=1;
			for(int j=i+1;j<str1.length;j++)
				 if(str1[i]==str1[j])
					 count ++;
			System.out.println("Occrence of"+str1[i]+":"+count);
			
		}
			

	}

}
