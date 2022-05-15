package StaticMethod;

class A{
	int a;
	static int b;
	static { 
		b = 5;
		System.out.println("클래스 A가 로딩됐습니다!!");
	}
	A(){
		a = 3;
	}
}
public class StaticInitialBlock {
	public static void main(String[] args) {
		System.out.println(A.b); // A.b가 실행되는 시점에 클래스 A가 메모리에 로딩되며 static{}초기화 블록 실행
	}
}
