
public class Px16 {
	public static void main(String[] args) {
		UF2 uf = new UF2();
	//	System.out.println("The Old Network ID is" );
		uf.display();
		System.out.println();
		uf.Union(4,3);
		uf.display();
		System.out.println();
		uf.Union(3,8);
		uf.display();
		System.out.println();
		uf.Union(6,9);
		uf.display();
		System.out.println();
		uf.Union(9,4);
		uf.display();
		System.out.println();
		uf.Union(2,1);
		uf.display();
		System.out.println();
		uf.Union(8,9);
		uf.display();
		System.out.println();
		uf.Union(5,0);
		uf.display();
		System.out.println();
		uf.Union(7,2);
		uf.display();
		System.out.println();
		uf.Union(6,1);
		uf.display();
		System.out.println();
		uf.Union(1,0);
		uf.display();
		System.out.println();
		uf.Union(6,7);
		uf.display();
		
	}
}
