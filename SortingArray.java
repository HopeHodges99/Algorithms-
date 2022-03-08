import java.util.Arrays;
public class SortingArray {
	public static void main(String[] args) {
		int [] arr = {1,4,6,7,8,94,2,1};
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[j]<arr[i]) {
					int sort = arr[i];
					arr[i]= arr[j];
					arr[j]= sort;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
	}

}
