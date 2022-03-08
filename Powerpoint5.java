import java.util.Scanner;

public class Powerpoint5 {

	public static void main(String[] args) {
		
    //	uf.display();
		Scanner sc = new Scanner(System.in);
		UnionFind uf = new UnionFind();
		int N =	sc.nextInt();	
		System.out.println("Type the number of sites you want");
		
    
	//int N =	sc.nextInt();	
	
	int s =	sc.nextInt();
	int d =	sc.nextInt();
		System.out.println( uf.find(s));
		System.out.println( uf.find(d));
		System.out.println("This connection is "+  uf.Connect(s,d));
		
	}

}
