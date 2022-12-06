package While;

public class While02 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while ((sum+=++i) <=100) { // 수식이 100 이하인경우에지속되게한것이다.
			//sum은 i 값을 0으뢰돈변수를 1씩 증가시켜가며 성장시키라는것이며
			//1 - 1 을더해 2가되고 
			System.out.printf("%d - %d%n", i, sum);
		}

	}

}
