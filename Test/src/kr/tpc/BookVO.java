package kr.tpc;
// 책(Object) 
public class BookVO {
		public String title;
		public int price;
		public String company;
		public int page;
		// 디폴트 생성자메서드(생략)
		public BookVO() {
			//초기화 작업
			this.title="java";
			this.price=14444;
			this.company="이지스";
			this.page=661;
		}
		// 생성자 메서드의 중복 정의 오버로딩
		public BookVO(String title, int price, String company, int page) {
			
			this.title=title;
			this.price=price;
			this.company=company;
			this.page=page;
			
		}
}
