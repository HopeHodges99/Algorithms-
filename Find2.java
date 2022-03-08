
public class Find2 {
public static int f(int[] p1, int[]p2) {
	int n=0;
     for (int i:p1) {
		for (int j:p2) {
			if (i==j) {
				n++;
}}}
return n;
}

public int f1(int[] p1, int[]p2) {
int n= 2;
n=n-f(p1,p2);
return n;
}

public int f2(int[] p1, int[]p2, int[]p3) {
int n= 3;
n=n-f(p1,p2);
n=n-f(p1,p3);
if (n>1) {
	n=n-f(p2,p3);
} return n;	 
}}