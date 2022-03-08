import java.util.Arrays;

public class QSD26 {
	public static void main(String[] args) {
		String str = "SORTEXAMPLE";
		char[] arr= str.toCharArray();
		arr= QuickSortP2.shuffle(arr);
		System.out.println(arr);
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
             if (Sort.less (i,j,arr)) {
            	 Partition(i,j,arr);
           	     Sort.exch(i,j,arr);
           	 
           
           	  } } } //Sort Act 1 on powerpoint 27 
        
        System.out.println(Arrays.toString(arr));
		
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
		//  System.out.println(Arrays.toString(left));
		  //System.out.println(Arrays.toString(right));
		  //System.out.println();
		   Sort.exch(0,i,left);
		  
			//System.out.println(Arrays.toString(left));
			//System.out.println(Arrays.toString(right));
		
		
	}

}