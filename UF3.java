
public class UF3 {
	int[] id = {1,1,1,8,8,1,1,1,8,8};
	
	public void Union(int p, int q) {
		int U1; 
		int U2;
		if (num(p)<num(q)) 
		{U1=id[p]; U2=id[q];}
		else {U1=id[q]; U2=id[p];}
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
	public int num(int p) {
	int n = 0;
	for (int i:id) {
		if (i==id[p]) {n++;}
	}
	return n;
	}
}
