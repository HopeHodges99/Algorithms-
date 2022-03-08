
public class Bag1 {
	int [] bag = new int [10];
	int size = 0;
	
	public void add (int s) {
		bag[size] = s;
		size++;
	}
  public boolean isEmpty() {
	  return (size==0);
	  
  }
  public int size() {
	 return size;
  }
}
