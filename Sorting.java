
public class Sorting {
	 public static boolean less (int i, int j, char[] arr) {
     	if (arr[j]< arr[i]) {
     		return true;
     	}
     	else 
     		return false;
     	}
     public static char[] exch (int i, int j, char[] arr) {
     	char sort = arr[i];
     	arr[i]= arr[j];
     	arr[j]= sort;
     	return arr;
     }
     public static boolean isSorted (char[] arr) {
     	for ( int i=0; i<arr.length-1; i++) {
     		if (arr[i]>arr[i+1]) {
     			return false;
     		}
     	}
			return true;
     }
    
     
}