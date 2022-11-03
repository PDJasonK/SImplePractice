import java.util.Scanner;

public class ScandAndIf {

		public static void main (String []args ) {
			
			
			Scanner sc = new Scanner (System.in);
			int a = sc.nextInt();
			sc.close();
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