
public class Stack1 {
	int[] stack = new int[2];
	int AtTop = 0;
	
	public void push(int n) {
		stack[AtTop] = n;	
		AtTop++;
		
	}
	
	public int print() {
	return AtTop;
	}
	
	
	
	
	
	}
