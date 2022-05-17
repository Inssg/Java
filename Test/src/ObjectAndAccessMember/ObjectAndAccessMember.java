package ObjectAndAccessMember;

class A {
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	void abc() {
		System.out.println("A 클래스 매서드 abc()");
	}
	
	class B{
		void bcd() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			abc();
			
		}
	}
}
public class ObjectAndAccessMember {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.bcd();
	}
}
