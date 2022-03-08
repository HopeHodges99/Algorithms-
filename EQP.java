
import java.util.ArrayList;
public class EQP {
	public static void main(String[] args) {
		//ArrayList  x = new ArrayList<ArrayList<String>>();
		
		int[] p1 = {21,22}; 
		int[]p2 = {21,38};
		int[]p3 = {5,9};
		
		Find2 f = new Find2();
		int new1=f.f1(p1,p2);
		int new2=f.f2(p1,p2,p3);
		if (new1==new2) {
			System.out.println("Can not accept");
		}
		else { x = {p1,p2,p3};
		System.out.println("The answer is"+ x);
		}

}

}