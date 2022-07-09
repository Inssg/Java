
public class TPC20 {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		// Dog.class, Cat.class
		Animal ani = new Dog(); // upCasting(자동형변환)
		ani.eat(); // ? -> 개처럼 먹다. 컴파일시점에서는 ani.eat지만 실행시점에서는 dog.eat
		
		ani = new Cat();
		ani.eat(); // ? -> 고양이 처럼먹다.
		//ani.night(); night 메서드는 Cat클래스에만 있기때문에 Cat으로 형변환 다운캐스팅해준뒤 사용.
		((Cat)ani).night();  // 밤에 눈에서 빛이 난다.(downcasting) -강제 형변환
	}

}
