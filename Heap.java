
public class Heap {

	public static void main(String[] args) {
		char [] arr = {'-','S','P','R','N','T','O','A','E','I','H','G',};
		swim(5,arr);
		}
	public static int swim(int k,  char[] arr) {
		System.out.println(k);
		while (k>1 && Sort.less(k, k/2, arr)) {
			Sort.exch(k,k/2,arr);
			k=k/2;
			System.out.println(k);
			
			
		}
		return k;
		
	} 

}
