package Q524;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		boolean c = (a !=0);   //a와 0이같지않을떄 트로다. 를 !=0로표현.
		boolean d = (b !=0); // 0 =false
		
		System.out.println("[JAVA]");
		System.out.printf("%b %b\n" , c , d);



	}
}