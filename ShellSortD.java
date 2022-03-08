import java.util.Arrays;

public class ShellSortD {
	public static void main(String[] args) { 
    String s = "Sortexample";
    int h = 3;
    char [] arr = s.toCharArray();
    for (int k=0; k<h;k++) {
    	for (int i=h+k; i<arr.length; i+=h) {
    		for (int j= i-h; j>-1 && Sorting.less_than(j, j+h, arr); j-=h) {
    		Sorting.exch(j, j+h, arr);
    		}
    	}
    }
    System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
	}
}
