import java.util.ArrayList;
import java.util.Arrays;

public class PD {
	ArrayList<Character> x = new ArrayList<>();
    ArrayList<Character> str= x;
	
	
	public void insert (char y) {
		x.add(y);
	}
	
	public char delMax() {
		int imax= imax(x);
		char max = x.get(imax);
		x.remove(imax);
		return max;
	}
	 public int imax (ArrayList<Character> x)  {
		 int imax= 0;
		 char max = x.get(0);
		 for (int i=0; i<x.size(); i++) {
			 if (x.get(i)> max) {
				 imax=i;
				 max=x.get(i);
			 }
		 }
		 return imax;
		 
	 }
	public void content() {
		System.out.println(x);
	}
	
	
	
	
	
	
	
	
	
	
}
