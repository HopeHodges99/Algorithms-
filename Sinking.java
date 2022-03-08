
public class Sinking {

	public static void main(String[] args) {
		char arr[]= {'-','T','H','R','P','S','O','A','E','I','N','G'};
		int index=2;
		System.out.println(index);
		while(index*2<arr.length && (arr[max(index,arr)] > arr[index])) {
			int max= max(index,arr);
			Sort.exch(index, max, arr);
			index=max;
			System.out.println(index);
			
		}

	}
	
	

	public static int max(int index, char[]arr) {
		int max=index*2;
		if (index*2+1<arr.length && arr[index*2]<arr[index*2+1]) { max=index*2+1;
		}
		   return max;
	   }

}


