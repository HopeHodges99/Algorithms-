
public class equivalence {
	public static void main(String[] args) {
		int[] p1 = {6,7}; 
		int[]p2 = {7,8};
		int n=2;
		 for (int i:p1) {
			for (int j:p2) {
				if (i==j) {
					n--;
					break;
				}
			}
		}
		System.out.print( n);
	}

}
