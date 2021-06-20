//
//public class construction {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
//

//public class construction {
//	String title;
//	String author;
//	
//	public construction(String t) {  // 생성자
//		title = t;
//		author = "작가미상";
//	}
//	public construction(String t, String a) {
//		title = t;
//		author = a;
//	}
//	public construction(String t, String a) {
//		title = t;
//		author = a;
//	}
//	public static void main(String[] args) {
//		construction littlePrince = new construction("어린왕자", "생텍쥐페리"); //생성자 Practice_Class(String t, String a) 호출
//		construction loveStory = new construction("춘향전"); // 생성자 Practice_Class(String t 호출)
//		construction kkh = new construction("혼공파", "김기환");
//		System.out.println(littlePrince.title + " " + littlePrince.author);
//		System.out.println(loveStory.title + " " + loveStory.author);
//		System.out.println(kkh.title + " " + kkh.author);
//	}
//}

//import java.util.Scanner;
//
//class Book {
//	String title;
//	String author;
//	
//	public Book(String title, String author) { // 생성자
//		this.title = title;
//		this.author = author;
//	}
//}
//
//public class construction {
//	public static void main(String[] args) {
//		Book [] book = new Book[2];
//		
//		Scanner scanner = new Scanner(System.in);
//		for(int i=0; i<book.length; i++) {
//			System.out.print("제목>>");
//			String title = scanner.nextLine();
//			System.out.print("저자>>");
//			String author = scanner.nextLine();
//			book[i] = new Book(title, author); //배열 원소 객체 생성
//		}
//		for(int i =0; i<book.length; i++) {
//			System.out.print("("+book[i].title+","+book[i].author+")");
//		}
//		scanner.close();
//	}
//}
