import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;


public class TPC25 {

	public static void main(String[] args) {
		
		//Animal a = new Animal(); -> X	
		// upcasting (부모의 역할로 사용 -> 명령을 내리는쪽)
		
		Animal ani = new Dog();
		ani.eat();
		ani.move();
		
		ani= new Cat();
		ani.eat();
		ani.move();
		((Cat)ani).night();

	}

}
