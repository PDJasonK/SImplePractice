package Q530;

import java.util.Scanner;

public class Main1 {
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      int b = 20 - a;
	      sc.close();
	      if(a>=20) {
	         System.out.println("adult");
	      } else {
	         System.out.printf("%d years later",b);
	      }
	   }

	}