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
//		Circle[] c; //Circle �迭�� ���� ���۷��� c ����
//		c = new Circle[5]; //5���� ���۷��� �迭 ����
//		
//		for(int i=0; i<c.length; i++) {  //�迭�� ���� ��ŭ
//			c[i] = new Circle(i);  // i��° ���� ��ü ����
//		}
//		for(int i=0; i<c.length; i++) {  // �迭�� ��� Circle ��ü�� ���� ���
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
//	public Book(String title, String author) { // ������
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
//			System.out.print("����>>");
//			String title = scanner.nextLine();
//			System.out.print("����>>");
//			String author = scanner.nextLine();
//			book[i] = new Book(title, author); //�迭 ���� ��ü ����
//		}
//		for(int i =0; i<book.length; i++) {
//			System.out.print("("+book[i].title+","+book[i].author+")");
//		}
//		scanner.close();
//	}
//}



//public class ClassArray {
//	static void replaceSpace(char a[]) {  //�迭 a�� ���鹮�ڸ� ','�� ����
//		for(int i=0; i<a.length; i++) {
//			if(a[i]==' ') {
//				a[i] = ',';
//			}
//		}
//		
//		static void printCharArray(char a[]) {
//			for(int i=0; i<a.length; i++) {
//				System.out.print(a[i]); //�迭 ���� ���� ���
//			}
//			System.out.println(); // �迭���� ��� ��� �� �ٹٲ�
//		}
//		
//		public static void main(String args[]) {
//			char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
//			printCharArray(c); //���� �迭�� ���
//			replaceSpace(c); //���� ���� �ٲٱ�
//			printCharArray(c); //������ �迭 ���� ���
//		}
//	}
//}





