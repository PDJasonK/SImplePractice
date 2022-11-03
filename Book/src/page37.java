public class page37 {

	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;//long big = 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010; // 8 진수로는 10, 10 진수로는 8이라는 숫자로 표기된다.
		int hexNum = 0x10; // 16진수 10, 10진수로는 16
		int binNum = 0b10;// 2진수 10, 10진수로는 2  ***0b는 2진수다.
		
		System.out.printf("b=%d%n", b); // 변수의 실제값이 뒷쪽에있다.  =%d\n은 정수의값을 출력한다는것임
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c); // %c는 문자 하나 출력하는것이지만 %d 정수로 하기 위해서 (int) c <-- 를 사용해 형태를 강제로 바꾼다.
		System.out.printf("finger=[%5d]%n" ,finger); // %d는 정수를 출력하는것인데 그사이에 들어간 숫자는 자릿수를 넣는다.* 정수값이사용한 스페이스자체가 5자리가된다는것이다.
		System.out.printf("finger=[%-5d]%n", finger);// %-숫자d 라고하면 d라는 숫자를 출력하되 -숫자만큼의 공백을 생성한다.
		System.out.printf("finger=[%050d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex); // #은 접두사 (16진수 0x , 8진수 0)
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum)
																			, binNum);

	}

}
