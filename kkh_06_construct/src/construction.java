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
//	public construction(String t) {  // ������
//		title = t;
//		author = "�۰��̻�";
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
//		construction littlePrince = new construction("�����", "�������丮"); //������ Practice_Class(String t, String a) ȣ��
//		construction loveStory = new construction("������"); // ������ Practice_Class(String t ȣ��)
//		construction kkh = new construction("ȥ����", "���ȯ");
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
//	public Book(String title, String author) { // ������
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
