
public class Bag {
	int [] Bag = new int [10];
	int Size= 0;
	
	 public void add (int s) {
		Bag[Size]= s;
		 
	 }
	
	public Boolean isEmpty() {
		 return (Size == 0);
	 }
	
    public int Size() {
         return Size;
			}
    
     public void display() {
        	if (Size > 0) {
            for (int i = 0; i < Size; i++) {
        	System.out.println(Bag[i]);  //So we dont get 0
        	
      }
    }
  }
}