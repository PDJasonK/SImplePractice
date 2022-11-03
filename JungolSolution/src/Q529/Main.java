package Q529;

import java.util.Scanner;

public class Main {
public static void main (String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int a , b ;
	a = sc.nextInt();
	b = sc.nextInt();
	sc.close();
	
	int c = b + 100 - a ;
	
	System.out.println(c);
	if (c > 0 ) {	
	System.out.println("Obesity");
	}
		
	}

}		
/*	int a = sc.nextInt();
	int b = sc.nextInt(); */
	

