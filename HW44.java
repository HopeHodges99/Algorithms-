import java.util.Random;

public class HW44 {
 public static void main(String[] args) {
		Random r = new Random();
		
	   int	n=100;

	   
	   int y1 =r.nextInt(99);             ;  
			   
	   int x11 = r.nextInt(y1);
	   int x12 = y1-x11;
		System.out.println( x11 + " + " + x12 + "|" + y1  );
		
		 int y2 = n-y1;
				 
		   int x21 = r.nextInt(y2);
		   int x22 = y2-x21;
			System.out.println( x21 + " + " + x22 + "|" + y2 );
		
			
			
			int	a = y1+y2 ;
			   int z1 = x11+x21;
			   int z2 = x12+x22;
			   System.out.println("-------------");
				System.out.println( z1 + " + " + z2 + "|" + a );
				
		

	}

}