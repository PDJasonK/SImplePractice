package Q529;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a , b ;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		System.out.println("a");
		System.out.println("b");
		int c = b + 100 - a ;
		
		System.out.println(c);
		if (c > 0 ) {	
		System.out.println("Obesity");
		}
	}
}