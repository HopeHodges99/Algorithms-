
public class BinaryTree2 {
public static void main(String[] args) {
		
		char [] arr = {'-','T','S','R','P','N','O','A','E','I','H','G',};
		char key = 'N';
		int index = index(key,arr);
		System.out.println(" Index of "+ key + " is " + index);
		int parent= index/2;
		int[] child = {index*2,index*2+1};
		
		//Check parent
		if(parent>0) {
			System.out.println( "The parent of " + key+ " is " + arr[parent]);}
		else {System.out.println(key+ "Does not have a root");}
		
		//Check right child
		if(child[0]<arr.length) {
			System.out.println("Left child of "+ key + " is " + arr[child[0]]);
		}else {System.out.println(key+ " Does not have a right child");}
		
		//Check left child
		if(child[1]<arr.length) {
			System.out.println("Right child of "+ key + " is " + arr[child[1]]);
		}else {System.out.println(key+ " Does not have a left child");}
		
		}
        
        
public static int index (char key, char[]arr) {
	int index=0;
	for(int i=1;i<arr.length;i++) {
		if(arr[i]==key) {
		 index=i;
		 break;
		} 
	}
	return index;
	
	
	
}
}
