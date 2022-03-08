import java.util.ArrayList;

public class AList {
	public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<>();
	a.add(0,"23");
	a.add(1 , "7");
	a.add(100);
	a.add(75);
	System.out.println(a);
	a.remove(0);
	System.out.println(a);
	for(int i:a) {System.out.print( i + " ");}
	System.out.println();
	for (int i=0;i<a.size();i++) {System.out.print(a.get(i)+ " ");}
}
}
