import java.util.Arrays;

public class ArraySort2 {
	 public static void main(String[] args) { 
         int[] arr = {3,4,66,83,21,33,55,1,0,5}; 
         for(int i=1;i<arr.length;i++){
        	   for(int j=i-1;j> -1 && arr[j+1] < arr[j]; j--){
        		int sort = arr[j];
   	        	arr[j]= arr[j+1];
   	        	arr[j+1]= sort;
   	        	
   	        }
        	   }
         System.out.println(Arrays.toString(arr));
              }
         
         }
