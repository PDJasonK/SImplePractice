/* else if 가 한문장이라고 한다. 그 뜻은 
  
 맨 밑에 } 가 하나 더 붙는 이유는 else if 가 한문장이기 떄문이다.
 * */
public class If01 {

	public static void main(String[] args) {

		int score = 75;
		
		if (score >= 90) {
			System.out.println("A");
			
		} else if (score >= 80) {
			System.out.println("B");
		}else if (score >= 70) {
			System.out.println("C");
		}else if (score >= 60){
			System.out.println("D");
		} else {
		System.out.println("F");
	}
}
}
