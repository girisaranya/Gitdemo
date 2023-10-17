
public class inttoStr {
	
	public static void main(String args[]) {
		 int x = 123;
		    Integer y = new Integer(x); // passing to constructor

		    System.out.println("Before conversion: " + y.getClass().getName());

		    System.out.println("After conversion: " + y.toString().getClass().getName());
		    System.out.println("After conversion (using Static method): " + Integer.toString(x).getClass().getName());
		  }
		
	}


