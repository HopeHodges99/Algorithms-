
public class Homework2 {

	public static void main(String[] args) {
		
		int [ ] n= {10,100,1000,};
		
		
		int sigma1=0;
		int sigma2=0;
		int sigma3=0;
		
	long time= System.nanoTime();//Starts Watch
		
		for (int i = 1; i <= n[0]; i++ ) {
			for(int j=2; j<= n[0];j++) {
			   for(int k=3; k<=n[0];k++) {
				 sigma1++;
				   }}}
		 for (int i = 1; i <= n[1]; i++ ) {
			for(int j=2; j<= n[1];j++) {
			   for(int k=3; k<=n[1];k++) {
				 sigma2++;
				   }}}
		 for (int i = 1; i <= n[2]; i++ ) {
				for(int j=2; j<= n[2];j++) {
				   for(int k=3; k<=n[2];k++) {
					 sigma3++;
					   }}}
		
	
		long time2 = System.nanoTime();//Starts Watch
		
		long dur = time2-time;
		
		time= System.nanoTime();//Ends Watch
		 
		double equation = .166667 * n[0] *(n[0]*n[0]-3 * n[0] + 2);
		// time2=System.nanoTime(); //Ends Watch
		
		double equation2 = .166667 * n[1]*(n[1]*n[1]-3 * n[1] + 2);
		double equation3= .166667 * n[2]*(n[2]*n[2]-3 * n[2] + 2);
		
	    time2=System.nanoTime(); //Ends Watch
	    
	    System.out.println("The left total is " + sigma1);
	    System.out.println("The right total is " + equation);
	    
	    System.out.println("The left total is " + sigma2);
	    System.out.println("The right total is " + equation2);
	    
	    System.out.println("The left total is " + sigma3);
	    System.out.println("The right total is " + equation3);
		long dur2 = time2-time;
	
		
		double s2=1f*(sigma1-equation)/sigma1*100;
		double s22=1f*(sigma2-equation2)/sigma2*100;
		double s23=1f*(sigma3-equation3)/sigma3*100;
		float d=1f*(dur-dur2)/dur2*100;
		System.out.println("For n ="+ n[0]+ "  "+"The estimation error:" +s2 +"%"+ "\t" + "The exact method is "+ d+ "% longer" );
		System.out.println("For n ="+ n[1]+ "  "+"The estimation error:" +s22+"%"+ "\t"+  "The exact method is" + d+ "% longer" );
		System.out.println("For n ="+ n[2]+ "  "+"The estimation error:" +s23+"%" +"\t" + "The exact method is "+ d+ "% longer" );

		




		}
		} 
