package AbstsractClass_2;

abstract class A{
	abstract void abc();
}

public class AbstsractClass_2 {
	public static void main(String[] args) {
		
		// 객체 생성
		A a1 = new A() {
			void abc() {
				System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
			}
		};
		A a2 = new A() {
			void abc() {
				System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
			}
		}; // 객체를 생성할 때마다 오버라이딩 필요
		a1.abc();
		a2.abc();
	}

}
