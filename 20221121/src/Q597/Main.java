package Q597;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a =sc.next();
		String b = sc.next();
		
		int count = 0;
		
		for ( int i = 0 ; i < a.length(); i++) {
			count++;
		}
		for(int j = 0 ; j <b.length(); j ++) {
			count++;
		}			
			System.out.println(count);
		}
	}
