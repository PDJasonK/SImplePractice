package Q512;

public class Main {

	public static void main(String[] args) {
		int a;
		a = 49;
		double d;
		d = 0.268300;
		
	//	String s1= "추의무게";
		//String s2= "중력의 비율";
		
	//	System.out.println((double)a + " * " + (double)d + " = " + ((double)a * d));
 
//		System.out.println("%d * %f6 = %f" , a, d , (a * d));
	//	System.out.println(a + "*" + d + "=" + (a * d));
		System.out.printf("%d * %.6f = %.6f", a,d, (a*d));
		
			// %d - 정수 %f - 실수 %s -문자열  \n - 줄바꿈  \c -> charcter 'A'와 같은 문자열 
		   // (예시:) %.6f <<< 소수점 6번쨰 자리까지 
		   // (printf) - 문자로 입력시 마지막에 변수 입력
		   //강제형변환 -> (타입명) <-강제로 타입을 변환시켜주기 입력위치- 변수 함수
	}
}
