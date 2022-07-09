import kr.tpc.*;
public class TPC21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		//Dog.class , Cat.class
		
		Animal ani = new Dog(); //upcatsting
		ani.eat();
		

	}

}
