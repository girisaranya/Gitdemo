import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortelements {
	public static void main (String args[]) {
	
	List namesList=new ArrayList();
	namesList.add("Ravi");
	namesList.add("Gopal");
	namesList.add("Arun");
	System.out.println(namesList);
	Collections.sort(namesList);
	System.out.println(namesList);

}
	
}
