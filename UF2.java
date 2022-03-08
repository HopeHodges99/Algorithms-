
public class UF2 {
	int[] id = {0,1,2,3,4,5,6,7,8,9};
	
	public void Union(int p, int q) {
		int U1;
		int U2;
		if (count(p) > count(q)) {
			 U1 = id[p];
			 U2 = id[q];
		} else {
			U1 = id[q];
			U2 = id[p];
		}
		if (!Connect(p,q)) {
			for (int i = 0; i < id.length ; i++) {
				if (id[i]==U1) {
					id[i]=U2;
				}
			}
		}
	}
	public int find(int p) {
		return id[p];
	}
	public boolean Connect(int p, int q) {
		return ( find(p) == find(q));
		}
	public void display() {
		for (int i:id) {
			System.out.print(i+ " ");
		}
	}
	public int count(int p) {
		int n=0;
		for (int i : id);
		   if (n == id[p]) {
			n++;
			}
		return n;
		}

}
