
public class E {
	public static void main(String[] args) {
		F find = new F();
		int[] p1 = {3,5}; 
		int[]p2 = {2,5};
		int[]p3 = {3,5};
		int n=3;
		n=n-find.f1(p1, p2);
		n=n-find.f1(p1, p3);
		if (n>1) {	
		n = n-find.f1(p2,p3);	}
		System.out.print(n);
		}

int[] id = {1,1,1,8,8,1,1,1,8,8};

public void Union(int p, int q) {
	int U = id[p];
	if (!Connect(p,q)) {
		for (int i = 0; i < id.length ; i++) {
			if (id[i]==id[q]) {
				id[i]=U;
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
}