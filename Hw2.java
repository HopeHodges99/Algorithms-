
public class Hw2 {
	public static void main(String[] args) {
		long h = 10;
		long s1=0;
		
		long time= System.nanoTime();//Starts Watch
		for(long i = 1; i <= h; i++ ) {
			s1+=i;
			}
		long time2 = System.nanoTime();//Starts Watch
		System.out.println("The left total is " + s1);
		long dur = time2-time;
		System.out.println("The left duration is "+ dur);
	
		time= System.nanoTime();//Ends Watch
		long sr = h*h/2;
	
				
	    time2=System.nanoTime(); //Ends Watch
	    System.out.println("The right total is " + sr);
		long dur2 = time2-time;
		System.out.println("The right duration of the code is" + dur);
		
		float s2=1f*(sr-s1)/s1*100;
		float d=1f*(dur-dur2)/dur2*100;
		System.out.println("The left algorithm is "+ d+ "% longer while the right Algorithim has" +s2+ "% error.");







		}
		} 


