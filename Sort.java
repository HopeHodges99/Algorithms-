
public class Sort {
	 public static boolean less(int i, int j, char[] arr) {
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
     public static char[] hSorted ( char[] arr) {
    	 int h = 4;
 		
 		for (int k=0; k<h; k++) {
 			for (int i = h+k;i<arr.length;i+=h) {
 				 for(int j=i-h;j > -1 && Sorting.less(j, j+h, arr);j-=h)
 				 {
 					 Sorting.exch(j, j+h, arr);
 					 
 				 }}}
	return arr;
 }
	public static char[] exch2(Comparable[] a, int j, int i) {
		char sort = a[i];
     	a[i]= a[j];
     	a[j]= sort;
     	return a;
     
	}

 }