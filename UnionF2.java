
public class UnionF2 {

	public static void main(String[] args) {
		UF1 uf = new UF1();
		uf.display();
		System.out.println(uf.find(0));
		System.out.println(uf.find(1));
		System.out.println(uf.find(2));
		System.out.println(uf.find(3));
		System.out.println(uf.find(4));
		System.out.println(uf.find(5));
		
		System.out.println(uf.Connect(2,3));
	}

}


