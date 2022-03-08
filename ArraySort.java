import java.util.Arrays;

public class ArraySort {
	  public static void main(String[] args) { 
	         int[] arr = {3,4,66,83,21,33,55,1,0,5}; 
	         int sort;
	         for(int i=0;i<arr.length;i++){
                 for(int j=i+1;j<arr.length;j++){

	               if(arr[j] < arr[i]){   
	            	   sort = arr[j];
                         arr[j] = arr[i];
                              arr[i]=sort;

	                 }

	              }
	         //System.out.println(Arrays.toString(arr));
	          }

	        System.out.println(Arrays.toString(arr));
}}