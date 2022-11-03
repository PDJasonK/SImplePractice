package Q528;

import java.util.Scanner;

public class Main {
	public static void main (String []args ) {
		
		
		Scanner sc = new Scanner (System.in);
				int a = sc.nextInt();
		sc.close();
		
		System.out.println(a);
		if  (a < 0) {
			System.out.println(a);
			System.out.println("minus");
		}
	}
}
		
		
/*		
		if  (a < 0) {
			System.out.println(a);
			System.out.println("minus");
		} else {
			System.out.println(a);
		}
	}
}
*/