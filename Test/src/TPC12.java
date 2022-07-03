import kr.tpc.BookVO;

public class TPC12 {
	public static void main(String[] args) {
		
		BookVO b1 = new BookVO();
		
		
		System.out.print(b1.title + "\t");
		System.out.print(b1.price + "\t");
		System.out.print(b1.company +"\t");
		System.out.print(b1.page + "\t");
		
		
		BookVO b2 =new BookVO("Pyhon", 160000, "대림", 339);
		System.out.print(b2.title + "\t");
		System.out.print(b2.price + "\t");
		System.out.print(b2.company +"\t");
		System.out.print(b2.page + "\t");
	}
}
