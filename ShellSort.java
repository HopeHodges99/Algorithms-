import java.util.Arrays;
//Hsort
public class ShellSort {

	public static void main(String[] args) {
		String s = "discusstheresultsbuyspecifyingwhenyouwoulduseeachmethodandwhy";
		//int[] h= {20,10,5,1};
		int[] h= {3,2,1,0};
		
		char []arr = s.toCharArray();
		for (int k=0; k<h; k++) {
			for (int i = h+k;i<arr.length;i+=h[0&1&2&3]) {
				 for(int j=i-h[0&1&2&3];j > -1 && Sorting.less(j, j+h[0&1&2&3], arr);j-=h[0&1&2&3])
				 {
					 Sorting.exch(j, j+h[0&1&2&3], arr);
					 
				 }}}
		System.out.println(Arrays.toString(arr));
		 System.out.println(Sort.isSorted(arr));
	}

}
