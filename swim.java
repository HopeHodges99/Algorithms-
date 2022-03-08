import java.util.Arrays;

public class swim {

	public static void main(String[] args) {
		char[] arr= {'-','S','P','R','N','T','O','A','E','I','H','G'};
		System.out.println(Arrays.toString(arr));
		int k=5; int x=k;
		while(k>1&& Sort.less(k, k/2, arr)) {
			Sort.exch(k, k/2, arr);
			k=k/2; 
		}
		if (x!=k) {
			System.out.println(Arrays.toString(arr));
		}
		else  {System.out.println("The heap is good");}
		}
	}

