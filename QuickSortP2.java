import java.util.Arrays;
import java.util.Random;

public class QuickSortP2 {

	public static void main(String[] args) {
		String str = "SORTEXAMPLE";
		char[] arr= str.toCharArray();
		//arr= shuffle(arr);
		System.out.println(arr);
		int a = 0;
		int b=arr.length;
		int i; int j=b-1;
		do {
			for (i=a+1; i<arr.length-1 && arr[i]<=arr[0] && j-i>1;i++) {}
			if (j-i>1) {
			for (j=b-1;j>1 && arr[j]> arr[0]&& j-i>1;j--) {}
			}
			if (Sort.less(i, j, arr)) {
				Sort.exch(i,j,arr);
				
			}
			a=i;
			b=j;
		} while (j-i>1);
		if (arr[i]> arr[0]) {
			i--;j--;
		} if(arr[j]<=arr[0]) {
			i++;j++;
		}
		Partition(i,j,arr);
		}
		
	static char[] shuffle (char[] arr) {
		Random r = new Random();
		for(int i=0; i<arr.length;i++) {
			int j=r.nextInt(arr.length);
			char temp=arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
			return arr;
		
		
		}
		static void Partition(int i, int j, char[] arr) {
			char [] left = new char[i+1];
			char [] right = new char [arr.length-i-1];
			for (int k=0; k<i+1;k++) {
				left[k]=arr[k];
			}
			for (int k =arr.length-1;k>i;k--) {
				right[k-i-1]=arr[k];
			}
			  System.out.print(Arrays.toString(left));
			  System.out.print(Arrays.toString(right));
			  System.out.println();
			   Sort.exch(0,i,left);
			  
				System.out.print(Arrays.toString(left));
				System.out.print(Arrays.toString(right));
				
			}





}
