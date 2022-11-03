import java.util.Scanner;

public class anotherPractice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int sum = a+100;
		int avg = b%10;
		
		System.out.print(sum);
		System.out.print(" " +avg);
		
	}
}
