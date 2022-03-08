import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		
	Bag2 bag = new Bag2();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your first number");
	int a = sc.nextInt();
	System.out.println("Enter your second number");
	int b = sc.nextInt();
	System.out.println("Enter the probabilty of getting " + a);
	float prob= sc.nextFloat();
	for (int i=0;i<prob*10;i++) {
		bag.add(a);
	}
	for (float i= prob*10;i<10;i++) {
		bag.add(b);
	}
		
		
	int a2 =0, b2=0;
	for (int i=0; i<1000; i++) {
	if(a==bag.get()) {
		a2++;
		} 
	else {b2++;}
	}
	System.out.println(a+ "has been picked " + a2 +" "+ "times" +" "+  "and"+ b+ "has been picked "+ b2 + "times");
	}
	
	}
