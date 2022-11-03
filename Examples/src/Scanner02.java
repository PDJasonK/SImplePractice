import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		// int num 엔터하고 num = 12; 한것과  한줄에 int num = 12; 도가능.
	//	int num = 12;
		//num = 12;
		
		// println은 다음줄로 점프 
		//print는 그냥 붙여서  (n1 + " "를 해도되고) 새로운 print를만들어 (" ") 해줘도된다./
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		sc.close();
		
		
		System.out.print(n1 + " ");
		System.out.println(n2);

	}
}