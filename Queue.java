//Add Enqueue 
public class Queue {
	int [] Queue = new int [7];
	int rear= 0;
	
	public void Enqueue (int data) {
		 Queue[rear]= data;
		 rear++;
	 }
	
	
	 public int[] print () {
		 return Queue;
	 }

	
	}

