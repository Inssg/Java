import kr.tpc.BOOKDTO;

public class TPC13 {
	public static void main(String[] args) {
		// 책 -> class(BookDTO) -> 객체 -> 인스턴스
		String title="스프링";
		int price=250000;
		String company="제이펍";
		int page=999;
		
		BOOKDTO dto; //dto(Object: 객체)
		dto=new BOOKDTO(title, price, company, page); // dto(Instance:인스턴스)
	
		bookPrint(dto);
	}
		public static void bookPrint(BOOKDTO dto) {
			System.out.println(dto.title);
			System.out.println(dto.price);
			System.out.println(dto.company);
			System.out.println(dto.page);
			
		}
	
}
