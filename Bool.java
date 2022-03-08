import java.util.Arrays;

public class Bool {

	public static void main(String[] args) {
		   int[] arr = {3,4,66,83,21,33,55,1,0,5};
		  // System.out.println(isSorted(arr));
	         int sort;
	         for(int i=0;i<arr.length;i++){
               for(int j=i+1;j<arr.length;j++){
                  if (less_than (i,j,arr)) {
                	  exch(i,j,arr);

	                 }

	              }
	         //System.out.println(Arrays.toString(arr));
	          }
	  

	        System.out.println(Arrays.toString(arr));
	        System.out.println(isSorted(arr));
	  }
	        public static boolean less_than (int i, int j, int[] arr) {
	        	if (arr[j]< arr[i]) {
	        		return true;
	        	}
	        	else 
	        		return false;
	        	}
	        public static int[] exch (int i, int j, int[] arr) {
	        	int sort = arr[i];
	        	arr[i]= arr[j];
	        	arr[j]= sort;
	        	return arr;
	        }
	        public static boolean isSorted (int[] arr) {
	        	for (int i=0; i<arr.length-1; i++) {
	        		if (arr[i]>arr[i+1]) {
	        			return false;
	        		}
	        	}
				return true;
	        }
			//public static boolean isSorted(int j, int i, char[] arr) {
				// TODO Auto-generated method stub
				//return false;
		//	}
	        
}
	        
	         
	        

