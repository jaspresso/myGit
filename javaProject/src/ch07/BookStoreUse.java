package ch07;

public class BookStoreUse {
	public static void main(String[] args) {
		BookStore bs=new BookStore();
		bs.setBookName("Java");
		bs.setAuthor("김선생");
		bs.setPress("영진");
		bs.setYear(2022);
		bs.setAmount(10);
		bs.setPrice(35000);
		
		bs.print();
		System.out.println(bs);
	}

}
