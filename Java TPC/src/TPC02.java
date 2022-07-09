import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC02 {

	public static void main(String[] args) {
		int a;
		a = 10;
		
		// 책 1권을 저장하기 위한 변수 선언
		Book b;
		b = new Book();
		b.price = 15000;
		b.title= "java";
		b.company = "한빛미디어";
		b.page= 700;
		System.out.println(b.title + "\t");
		System.out.println(b.price + "\t");
		System.out.println(b.company +"\t");
		System.out.println(b.page + "\t");
		
		PersonVO p;
		p = new PersonVO();
		p.name ="박매일";
		p.age = 40;
		p.weight = 68.4f;
		p.height = 175.f;
		
		System.out.print(p.name+"\t");
		System.out.print(p.age+"\t");
		System.out.print(p.weight+"\t");
		System.out.print(p.height+"\t");
	}

}
