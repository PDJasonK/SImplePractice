package Q617;

public class Person {
	private String name; // 이 이름과 키라는것이 주가될것이라는 것을 설명하고 시작한다는 개념으로 받아들여라.
	private int height; // 이 이름과 키라는것이 주가될것이라는 것을 설명하고 시작한다는 개념으로 받아들여라.
	
	public Person(String name, int height) { // 위에 명시했던 것들이 어떠한 형태인지 설명하고 
		this.name = name;   // 그것을 이곳에 스테이시킨다 명명하는 것이다.
		this.height =height;
	}
	
	public void print() {
		System.out.println(name + " " + height); // 이름과 키를 결국 프린트할것
	}
	public int geHeight() {
		return height;   // 이 int라는것을 잊지말고가지고오도록 세이브한다 생각하면되는것이다.
	}

}

