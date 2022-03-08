
public class BinaryHeap {

	public static void main(String[] args) {
		char arr[]= {'-','T','H','R','P','S','O','A','E','I','N','G'};
		int index=6;
    if (index*2<arr.length) {
	System.out.println("Not at bottom");
}else {
	System.out.println("At the bottom");
}
	}

	public static int index (char key, char[]arr) {
		int index=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==key) {
			 index=i;
			 break;
			} 
		}
		return index;
		
		
		
	}
}
