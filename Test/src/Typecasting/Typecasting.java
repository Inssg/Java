package Typecasting;

class A{}
class B extends A {}
class C extends B {}
class D extends B {}

public class Typecasting {
	public static void main(String[] args) {
		
	//업캐스팅
		A ac = (A) new C; // C-> A
		B bc = (B) new C; // C-> B 
		
		B bb = new B();
		A a = (A) bb; // B -> A 
		
		// 다운 캐스팅 
		A aa = new A();
	//	B b = (B) aa  A -> B 다운 캐스팅 불가
	
		A ab = new B();
		B b = (B) ab;   // A-> B다운캐스팅 가능
		C c = (C) ab;   // A-> C 불가
		
		B bd = new D();
		D d = (D) bd;  // B -> D 다운캐스팅 가능
	
		A ad = new D();
		B b1 = (B) ad;  // A -> B 다운캐스팅 가능
		D d1 = (D) ad;  // A -> D 다운캐스팅 가능
		
	}
}

