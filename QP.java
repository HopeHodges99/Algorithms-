public class QP {
	public static void main(String[]args) {
		
		Queue Q = new Queue();
		Q.Enqueue(5);
		Q.Enqueue(4);
		Q.Enqueue(9);
		
		
		for (int i:Q.print()) {
			
			System.out.print(i + " ");
			                                //We get all and 0
		}
        
	
	}
}
