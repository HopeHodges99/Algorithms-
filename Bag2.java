import java.util.Random; 
public class Bag2 {
	int [] Bag = new int [10];
	int Size= 0;
	Random r = new Random();
	
	public void add(int i) {
		Bag[Size]= i;
		Size++;
	}
	public int get() {
		int get = r.nextInt(10);
		return Bag[get];
	}
	public void display() {
    	if (Size > 0) {
        for (int i = 0; i < Size; i++) {
    	System.out.println(Bag[i]); 
    	
  }
	
	
	
	
    	}}
	
	
}
