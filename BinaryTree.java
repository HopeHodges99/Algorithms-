import java.util.Arrays;

public class BinaryTree {

	public static void main(String[] args) {
		
		char [] arr = {'-','T','S','R','P','N','O','A','E','I','H','G',};
		
		char key = 'N';
		int index = index(key,arr);
		System.out.println(" Index of "+ key + " is " + index);
		int parent=index/2;
		int[] child= {2*index,2*index+1};
		if (parent>0) {
			System.out.println(" The parent of "+ key + " is " + arr[parent]);
		}
		else {System.out.println(key + "root is ");}
		if (child[0]<arr.length) {
			System.out.println(" The left child of" + key + " is "+ arr[child[0]]);
			if (child[1]<arr.length) {
				System.out.println(" The left child of" + key + " is "+ arr[child[1]]);
				}
	} else {System.out.println(key +" does not have children ");}
	}
	public static int index (char key, char[]arr) {
		int index = 0;
		for (int i=1; i<arr.length;i++) {
			if (arr[i]==key) {
				index =i;
				break;
			}
		}
		return index;
	}
}
