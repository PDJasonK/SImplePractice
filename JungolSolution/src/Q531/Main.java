package Q531;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int weight = sc.nextInt();
		sc.close();
		
		if (weight <= 50.80 ) {
			System.out.println("Flyweight");
		} else if  (weight <= 61.23){
			System.out.println("Lightweight");
		}
			
		}
			
		
		

	}

}
