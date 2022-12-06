package While;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		int num = 0 , sum =0 ;
		System.out.println("Type integer digits. (ex_12345 ->");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		
		while ( num!= 0 ) {
			sum += num%10;
			System.out.printf("sum = %3d num =%d%n", sum, num);
			
			num /=10; 
		}
		System.out.println("각 자리수의 합: " +sum);
		
		

	}

}
