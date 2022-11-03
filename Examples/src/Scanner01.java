import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("두자리 정수를 하나 입력해주세요.");
		String input = scanner.nextLine();
		
		scanner.close(); 

		int result =  Integer.parseInt(input);
		
		
		System.out.println("입력내용 :" + input);
		System.out.printf("result=%d\n", + result);
		
		//++는

	}

}
