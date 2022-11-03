package Q512;
public class page38 {

	public static void main(String[] args) {
		String url = "www.codechobo.com";
		
		float f1 = .10f; // 0.10 , 1.0e-1
		float f2 = 1e1f;  // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1=%f, %e, %g%n" , f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n" , f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3 , f3 , f3);
		
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d); // 전체 14자리중 소수점 0자리

		System.out.printf("[12345678901324567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);
		System.out.printf("[%.8s]%n", url);		//8글자만 하고 나머지는 자른다. 

	}

}
