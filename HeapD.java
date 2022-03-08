import java.util.Arrays;

public class HeapD {

	public static char[] insert(char[]arr, char a) {
	char []arr1 = new char [arr.length+1];	
	arr1[arr.length]=a;
	for(int i=0; i< arr.length; i++) {
		arr1[i]=arr[i];
	}
		return arr1;
		
	}
	public static void swim(char[]arr, int index) {
		int a=index;
		while(index>1&& Sort.less(index, index/2, arr)) {
			Sort.exch(index, index/2, arr);
			index=index/2;
		}
		if (a!=index) {
			System.out.println(Arrays.toString(arr));
		}
		else  {System.out.println("The heap is good");}
		}
	public static void sink(char[]arr, int index) {
		while(index*2<arr.length && arr[maxInc(index,arr)]>arr[index]) {
			int max = maxInc(index,arr);
			Sort.exch(index,max,arr);
			index=max;
		}}
	public static int maxInc(int index, char[]arr) {
		int max=index*2;
		if (index*2+1<arr.length && arr[index*2]<arr[index*2+1]) { max=index*2+1;
		}
		   return max;
	   }
   
	}

