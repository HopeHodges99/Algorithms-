//import java.util.Stack;
public class StackP {
	public static void main(String[]args) {
		
		Stack s = new Stack();
		s.push(15);
		s.push(5);
		s.push(4);
		s.push(9);
		s.pop();
		
		for (int i:s.print()) {
			
			System.out.print(i + " ");
			
		}
          
	
	}
}
