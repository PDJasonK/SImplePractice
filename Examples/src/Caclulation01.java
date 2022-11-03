public class Caclulation01 {

	public static void main(String[] args) {
		int a , b;
		a = 10;
		b = 4;
		//int a = 10;  다음칸 int b = 4; 로해도 똑같음.
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a , b , a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
/*		System.out.printf("%d / %f = %f%n", a, b, a / b);
f가 들어갔따면 소수점을 표현하기위한것이고 이미 "  ~~~  " 밖의 내용은 int정수로 활용되었기에 억지로 float(소수점 설정을 해줘야한다	*/
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
	}

}
