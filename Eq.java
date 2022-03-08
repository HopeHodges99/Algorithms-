
public class Eq {
	public static void main(String[] args) {
		int [] p1 = {3,7};
		int []p2 = {73,5};
		int []p3 = {33,79};
	    int h = 3;//We have 3 pairs
	      for (int i: p1) {
	    	for (int j : p2) {
	    	   for (int k : p3) {
	    	   if (i==j) {
	    		h--;
	    		   }
	    	   if (i==k) {
	    		   h--;
	    	   }
	    	   if (j==k) {
	    		   h--;
	    	   }
	        }
		
		System.out.println(h+ " is how many equivalnce classes we have");
		System.exit(0);
		
		
	}

}}}
