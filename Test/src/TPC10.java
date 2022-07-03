import kr.tpc.BOOKDTO;

public class TPC10 {
	public static void main(String[] args) {
		//int, float, char, boolean -> PDT
		int a;
		a=10;
		// 책이라는 자료형을 만들자 --> class
		//객체 생성
		BOOKDTO b=new BOOKDTO();
		b.title ="자바";
		b.price=17999;
		b.company="영진";
		b.page=6890;
		
		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.print(b.company +"\t");
		System.out.print(b.page + "\t");
	}
}
