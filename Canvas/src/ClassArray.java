//class Circle {
//	int radius;
//	public Circle(int radius) {
//		this.radius = radius;
//	}
//	public double getArea() {
//		return 3.14*radius*radius;
//	}
//}
//
//public class ClassArray {
//	public static void main(String[] args) {
//		Circle[] c; //Circle 배열에 대한 레퍼런스 c 선언
//		c = new Circle[5]; //5개의 레퍼런스 배열 생성
//		
//		for(int i=0; i<c.length; i++) {  //배열의 개수 만큼
//			c[i] = new Circle(i);  // i번째 원소 객체 생성
//		}
//		for(int i=0; i<c.length; i++) {  // 배열의 모든 Circle 객체의 면적 출력
//			System.out.print((int)(c[i].getArea()) + " " ); 
//		}
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
//public class ClassArray {
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



//public class ClassArray {
//	static void replaceSpace(char a[]) {  //배열 a의 공백문자를 ','로 변경
//		for(int i=0; i<a.length; i++) {
//			if(a[i]==' ') {
//				a[i] = ',';
//			}
//		}
//		
//		static void printCharArray(char a[]) {
//			for(int i=0; i<a.length; i++) {
//				System.out.print(a[i]); //배열 원소 문자 출력
//			}
//			System.out.println(); // 배열원소 모두 출력 후 줄바꿈
//		}
//		
//		public static void main(String args[]) {
//			char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
//			printCharArray(c); //원래 배열로 출력
//			replaceSpace(c); //공백 문자 바꾸기
//			printCharArray(c); //수정된 배열 원소 출력
//		}
//	}
//}





