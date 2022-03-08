
 class Stack {
	
 int[] stack = new int[4];
 int ATtop= 0;
 public void push (int data) {
	 stack[ATtop]= data;
	 ATtop++;
 }
 
 public void pop() {
	    ATtop--;
		stack[ATtop]=0;
		
		
	}
 public int[] print () {
	 return stack;
 }

}
