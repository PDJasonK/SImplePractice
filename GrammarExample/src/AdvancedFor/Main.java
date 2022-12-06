package AdvancedFor;

public class Main {

	public static void main(String[] args) {

		int []arr = {10 , 20 ,30 ,40 ,50};
		int sum = 0;

		for (int i=0; i<arr.length; i+=2)
		System.out.printf("%d\t", arr[i]);
		System.out.println();
		
		for (int tmp : arr) {
			System.out.printf("%d\t" , tmp);
			sum += tmp;
		}
		System.out.println();
		System.out.println("sum : " + sum);
		
	}
}
