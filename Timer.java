public class Timer {
	public static void main(String[] args) {
	
		
long h = 0;
long time= System.nanoTime();
for(long i = 1; i <= 10; i++ ) {
	h+=i;
	}
long time2 = System.nanoTime();
System.out.println("The total is " + h);
long dur = time2-time;
System.out.println("The duration the code is "+ dur);
float f = (dur-h)/h*100;
System.out.println(f+"%");
//////////////////////////////////
long t1=System.nanoTime();
long s = 5*11;
long t2=System.nanoTime();
System.out.println("The total is " + s);
long duration = t2-t1;
System.out.println("The duration of the code is" + duration);
float f2 = (duration-s)/s*100;
System.out.println(f2+"%");








}
} 
