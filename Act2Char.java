import java.util.Scanner;

public class Act2Char {

	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a word");
		String w = input.nextLine();
		System.out.print(w.charAt(0)+ " ");
		for (int i= 1; i< w.length(); i++) {
			int n=1;
			for (int j=0; j<i; j++) {
				if(w.charAt(i)== w.charAt(j)) {
					n++;
				}
			}
			if (n==1) {
				System.out.print(w.charAt(i)+ " ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
