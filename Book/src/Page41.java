import java.util.Scanner;

public class Page41 {
	public static void main (String[]args) {
	//String 은 문자를 나열하는것 /글자쓰는것
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 입력 긔긔");
		
//		String input1 = scanner.nextLine();
	//	int input2 = scanner.nextInt();		
		//int num =  Integer.parseInt(input1);
		scanner.close();
		
		double input = scanner.nextDouble();
		
		
		System.out.println("입력내용 " +input);
		System.out.printf("num=%d%n", input);		
		
		//
	}
}	