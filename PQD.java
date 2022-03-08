
public class PQD {

	public static void main(String[] args) {
		PD a = new PD();
		a.insert('p'); a.content();
		a.insert('q'); a.content();
		a.insert('e'); a.content();
		System.out.print(a.delMax()+ " ");a.content();
		a.insert('x'); a.content();
		a.insert('a'); a.content();
		a.insert('m'); a.content();
		System.out.print(a.delMax()+ " ");a.content();
		a.insert('p'); a.content();
		a.insert('l'); a.content();
		a.insert('e'); a.content();
		System.out.print(a.delMax()+ " ");a.content();
	}

}
