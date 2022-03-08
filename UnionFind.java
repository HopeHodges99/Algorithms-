
public class UnionFind {
int [] net;
int N;
    


public void display() {
for (int i:net) {
	System.out.print(i+ " ");
}}
public int find(int n) {
	return net[n];
}
public boolean Connect(int p, int q) {
	return ( find(p) == find(q));
	}

}
