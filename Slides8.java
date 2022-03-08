
public class Slides8 {
	public static void main(String[] args) {
	
		
long h = 0;
long time= System.nanoTime();
for(long i = 1; i <= 10000; i++ ) {
	h+=i;
	
}
System.out.println("The total is " + h);
long time2 = System.nanoTime();
long dur = time2-time;
System.out.println("The lenght it took to run this code is "+ dur);
//////////////////////////////////
long t1=System.nanoTime();
long s = 5000*10001;
long t2=System.nanoTime();
System.out.println("The total is " + s);
long duration = t2-t1;
System.out.println("The lenght it took to run this code is" + duration);








}
} 
