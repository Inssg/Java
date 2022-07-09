 package kr.poly;

public class Dog extends Animal {
	
	// override 재정의
	
	public Dog() {
		super();
	}

	@Override
	public void eat() {
		System.out.println("개처럼 먹다.");
	}
	
}
