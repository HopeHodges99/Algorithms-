
public class UF1 {
int []net = {1,1,4,4,4,1};

public int find(int p) {
	return net[p];
}
public void display() {
	for (int i:net) {
		System.out.print(i+ " ");
	}
	
}
public boolean Connect(int p, int q) {
	return ( find(p) == find(q));
	}
}
