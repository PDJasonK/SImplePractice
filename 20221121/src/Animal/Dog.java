package Animal;

public class Dog extends Animal{
	
	public Dog() {
		this.kind = "mammals";
	}

	@Override
	public void sound() {
		
		System.out.println("Bow Bow");
	}
	

}
