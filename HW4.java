import java.util.Random; 
public class HW4 {

	public static void main(String[] args) {
		Random r = new Random();
		
	   int	n=100;

		
	   int x11 = r.nextInt(n);
	   int x12 = n-x11;
	   int x21 = r.nextInt(n);
	   int x22 = n-x11;
		int y1 = r.nextInt(n); // only one random number is needed
		int y2 = n-y1; // other will be subtract of n and r1
		int z1 = r.nextInt(n) + 1; 
		int z2 = n-z1; 

		
		//System.out.println(y1 + " + " + y2 + "|" + n);
	//	System.out.println(z1 + " + " + z2 + "|" + n);
	
		for (int d=y1; x11<=d; x12 = y1-x11 ) { //Getting y1
		System.out.println( x11 + " + " + x12 + "|" + y1 + "Y1");
		
		break;
			}
		
	//for (int d=y2; x21<=d; x22 = d-x21 ) { //Getting y2
	  //  	System.out.println( x11 + " + " + x12 + "|" + y1 + "Y1");
		//	System.out.println(x21 + " + " + x22 + "|" + d + " " + "Y2");
			//break;
			//}
	
//for (int d=100; y1<=d; y2 = d-y1 ) {
	//System.out.println(y1 + " + " + y2 + "|" + d);
	//break;}
//for (int d=100; z1<=d; z2 = d-y1 ) { //Getting
	 
	//	System.out.println(z1 + " + " + z2 + "|" + d);
	//	break;}
	}

}
