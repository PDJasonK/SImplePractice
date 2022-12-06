package While_Boolean;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		boolean flag = true ; // while의 조건문으로 사용될 변수이다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("put digits that you want to combine with.(to end you can type '0' in)");
		while (flag ) {   //flag's value is true because of that it will stay as true.
			System.out.print(">>");
			
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			if (num!=0) {
				sum+= num; // num 이 0이아니면, sum에더한다.
			}else { 
				flag = false ; // num 이 0일경우에는 flag(조건식을 ) 를 false로변환하기에 프로그램이 종료된다.
				
			}
			System.out.println("합계 : " + sum);
			}

		}

	}

