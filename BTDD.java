
public class BTDD {
	public static void main(String[] args) {
		char [] arr = {'-','T','S','R','P','N','O','A','E','I','H','G',};
		int index=2;
		if(index*2<arr.length-1) {
			System.out.println(arr[index*2]);
			
		}
		else if (index*2<arr.length) {
			if (arr[index*2]<=arr[index*2+1]) {
				System.out.println(arr[index*2+1]);
			}
			else {System.out.println(arr[index*2]);}
		}
		else {System.out.println("Key has no children");}
		
		
		
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


