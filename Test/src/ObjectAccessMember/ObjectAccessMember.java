package ObjectAccessMember;

class A{
	int a = 3;
	static int b = 4;
	void method1() {
		System.out.println("instance method");
	}
	static void method2() {
		System.out.println("static method");
	}
	// 정적 이너 클래스
	static class B {
		void bcd() {
			//필드 사용
			System.out.println(b);
			method2();
		}
	}
}
public class ObjectAccessMember {
	public static void main(String[] args) {
		A.B b = new A.B();
		b.bcd();
	}

}
