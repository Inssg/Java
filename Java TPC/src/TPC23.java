import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.다형성 인수
		Dog d = new Dog();
		display(d);
		Cat c = new Cat();
		display(c);
	}
								//인자가 upcasting
	
	private static void display(Animal r) { //다형성인수
		r.eat();
		//r.night();
		//Dog 타입 받았을때 에러남 if절로 Cat타입일때만실행하게 묶기
		//r이 Cat타입 객로부터 만들어 졌다면 true
		if( r instanceof Cat) {
		((Cat)r).night(); //downcasting
		}
		
	}

	

}
