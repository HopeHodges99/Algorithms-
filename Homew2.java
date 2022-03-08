
public class Homew2 {
	public static void main(String[] args) {
			
			int [ ] n= {10,100,1000,};
			int sigma1=0;
			int sigma2=0;
			int sigma3=0;
			
		long time410= System.nanoTime();//Starts Watch
		long time2410=System.nanoTime(); //Starts Watch	
			for (int i = 1; i <= n[0]; i++ ) {
				for(int j=2; j<= n[0];j++) {
				   for(int k=3; k<=n[0];k++) {
					 sigma1++;
					   }}}
	     time410= System.nanoTime();//Ends Watch
	    
	    long time4100= System.nanoTime();//Starts Watch 
		long time24100=System.nanoTime(); //Starts Watch
			 for (int i = 1; i <= n[1]; i++ ) {
				for(int j=2; j<= n[1];j++) {
				   for(int k=3; k<=n[1];k++) {
					 sigma2++;
					   }}} 
	    time4100= System.nanoTime();//Ends Watch
		
	    long time41000 = System.nanoTime();//Start watch
		long time241000=System.nanoTime(); //Starts watch
			 for (int i = 1; i <= n[2]; i++ ) {
					for(int j=2; j<= n[2];j++) {
					   for(int k=3; k<=n[2];k++) {
						 sigma3++;
						   }}}
	    time41000 = System.nanoTime();//End watch
		
	    	long dur1 = time2410-time410;
	    	long dur2 = time24100-time4100;
	    	long dur3 = time241000-time41000;

			 double equation = .166667 * n[0] *(n[0]*n[0]-3 * n[0] + 2);
			  time2410=System.nanoTime(); //Ends 
			 
		     double equation2 = .166667 * n[1]*(n[1]*n[1]-3 * n[1] + 2);
			  time24100=System.nanoTime();//Ends
			
		    double equation3= .166667 * n[2]*(n[2]*n[2]-3 * n[2] + 2);
			  time241000=System.nanoTime(); //Ends
			
		    System.out.println("The left total of "+n[0] +" " + "is"+ " "+sigma1);
		    System.out.println("The right total of "+n[0]+" " + "is"+ " "+ equation);
		    
		    System.out.println("The left total of "+n[1] +" " + "is"+ " "+ sigma2);
		    System.out.println("The right total of "+n[1]+" " + "is"+ " "+ equation2);
		    
		    System.out.println("The left total of "+ n[2]+" " + "is"+ " "+ sigma3);
		    System.out.println("The right total of "+n[2]+" " + "is"+ " "+ equation3);
		    
			long dur11 = time2410-time410;
			long dur22 = time24100-time4100;
			long dur33 = time241000-time41000;
			
			double s2=1f*(sigma1-equation)/sigma1*100;
			double s22=1f*(sigma2-equation2)/sigma2*100;
			double s23=1f*(sigma3-equation3)/sigma3*100;
			
			float d1=1f*(dur1-dur11)/dur11*100;
			float d2=1f*(dur2-dur22)/dur22*100;
			float d3=1f*(dur3-dur33)/dur33*100;
			
			System.out.println("For n ="+ n[0]+ "  "+"The estimation error:" +s2 +"%"+ "\t" + "The exact method is "+ d1+ "% longer" );
			System.out.println("For n ="+ n[1]+ "  "+"The estimation error:" +s22+"%"+ "\t"+  "The exact method is" + d2+ "% longer" );
			System.out.println("For n ="+ n[2]+ "  "+"The estimation error:" +s23+"%" +"\t" + "The exact method is "+ d3+ "% longer" );

			}
			} 


