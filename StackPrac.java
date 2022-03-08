
import java.util.Stack; 
import java.util.Queue;

public class StackPrac {
	
	public static void main(String[] args) {
		
	        Stack<String> stack = new Stack<String>(); 
	        
	    
	        stack.push("Hope"); 
	        stack.push("Payne"); 
	        stack.push("Spencer"); 
	        stack.push("Izzy"); 
	        stack.push("Spain"); 
	  
	       
	        System.out.println("Stack: " + stack); 
	  
	        
	        System.out.println("The element is: " + stack.get(2)); 
	        System.out.println(stack.peek());
	        
	        stack.pop();
	        stack.pop();
	        System.out.println(stack);
	        
	        
	    } 
	
}

