import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {
	
	public static void main(String[] args) {
		// Dog, Cat -->
		
		
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		
		// Dog.java(x) -소스파일, Dog.class(o) 다른사람이 나한테 클래스를 줬을때
		
		
		// Animal <--------- Dog.class , Cat.class
	/*
		Animal ani = new Dog();
		ani.eat();
		
		ani= new cat();
		ani.eat(); 
	*/
		
	}

}
