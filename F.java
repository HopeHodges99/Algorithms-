
public class F {
	public int f1(int[] p1, int[]p2) {
		
	
	int n=0;
	 for (int i:p1) {
		for (int j:p2) {
			if (i==j) {
				n++;
				break;
			}
		}
	}
	return n;
}


}

