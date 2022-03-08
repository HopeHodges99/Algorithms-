import java.util.Arrays;

public class ArrayBool {
	 public static void main(String[] args) { 
         int[] arr = {3,4,66,83,21,33,55,1,0,5}; System.out.println(arr.isSorted(arr));
         for(int i=0;i<arr.length;i++){
        	   for(int j=i+1;j<arr.length;j++){
        		   if (less(i,j,arr)) {
        			   exch(i,j,arr);
        	   }

              }
         
         }
         System.out.println(Arrays.toString(arr));
	 }

	 
       public static boolean less (int i, int j, int[]arr) {
    	   if (arr[j] < arr[i]) {
    		   return true;
    	   }else 
    		   return false;
    	   
       }
        public static int[] exch (int i, int j, int[]arr) {
        	 int  sort = arr[i];
              arr[i] = arr[j];
                arr[j]=sort;
                return arr;

       }
}

