package DoWhile;

import java.util.Scanner;

public class DoWhile_Ex01 {

	public static void main(String[] args) {
		int input = 0 , answer = 0 ;
		
		answer = (int) (Math.random() * 10) +1; // 1~100 Math.random() 에넣은 괄호를 이용하여 *100으로 1~100사이의 넘버저장.
				Scanner sc = new Scanner(System.in);
				System.out.println(answer);
		do {
			System.out.println("1 과 100사이중 고르세요");
			input = sc.nextInt();
		if (input > answer) {
			System.out.println("다운");
			
		}else if  (input < answer)  {
			System.out.println("업") ;
		}
	}		while(input!=answer);
		System.out.println("정답!");


	}

}
