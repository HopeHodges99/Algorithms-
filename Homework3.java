import java.util.Arrays;

public class Homework3 {
	public static void main(String[] args) {
		String str="discusstheresultsbuyspecifyingwhenyouwoulduseeachmethodandwhy";
		// ShellShort with {20,10,5,1};
		int[] arr = {20,10,5,1};
		// ShellShort with {364,121,40,13,4,1};
	    int [] arr1= {364,121,40,13,4,1};
		      System.out.println("HSORT");
				
			   System.out.println(Arrays.toString(arr));
			   System.out.println(Arrays.toString(arr1));
			   
	//Insertion Sort
	 char[] arr2 = str.toCharArray();
	   
        for(int i=0;i<arr2.length;i++){
          for(int j=i+1;j<arr2.length;j++){
             if (Sort.less (i,j,arr2)) {
           	  Sort.exch(i,j,arr2);
           	  
             } } }
       System.out.println("INSERTION SORT");
       System.out.println(Arrays.toString(arr2));
       System.out.println(Sort.isSorted(arr2));
       
        //Selection Sort
        char[] arr3 = str.toCharArray();
		for (int i=1; i<arr3.length; i++) {
			for (int j=i-1; j>-1 && Sort.less(j,j+1,arr3);j--) {
				Sort.exch(j, j+1, arr3);
				}	}
		 System.out.println("SELECTION SORT");
		 System.out.println(Arrays.toString(arr3));
		 System.out.println(Sort.isSorted(arr3));
		
		}
		
		
}

