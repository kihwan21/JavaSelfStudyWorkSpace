//public class Practice_Class {
//	int radius; 		// ���� ������ �ʵ�
//	String name; 	
//	// ���� �̸� �ʵ�
//
//	public Practice_Class() { } 	// ���� ������
//	
//	public double getArea() { // ���� ���� ��� �޼ҵ�
//		return 3.14*radius*radius;
//	}
//
//	public static void main(String[] args) {
//		Practice_Class pizza; 			// ���۷��� ���� pizza ����
//		pizza = new Practice_Class(); 		// Circle ��ü ����
//		pizza.radius = 10; 		// ������ �������� 10���� ����
//		pizza.name = "�ڹ�����"; 	// ������ �̸� ����
//		double area = pizza.getArea(); 	// ������ ���� �˾Ƴ���
//		System.out.println(pizza.name + "�� ������ " + area);
//		
//		Practice_Class donut = new Practice_Class(); 	//Practice_Class ��ü ���� 
//		donut.radius = 2; 		// ������ �������� 2�� ����
//		donut.name = "�ڹٵ���"; 	// ������ �̸� ����
//		area = donut.getArea(); 		// ������ ���� �˾Ƴ���
//		System.out.println(donut.name + "�� ������ " + area);
//	}
//}

//import java.util.Scanner;
//
//public class Practice_Class {
//	int width;
//	int height;
//	
//	public int getArea() {
//		return width*height;
//	}
//	
//	public static void main(String[] args) {
//		Practice_Class rect = new Practice_Class (); // ��ü ����
//		Scanner scanner = new Scanner(System.in);
//		System.out.print(">> ");
//		rect.width = scanner.nextInt();
//		rect.height = scanner.nextInt();
//		System.out.println("�簢���� ������ " + rect.getArea());
//		scanner.close();
//	}
//}

//public class Practice_Class {
//	String title;
//	String author;
//	
//	public Practice_Class(String t) {  // ������
//		title = t;
//		author = "�۰��̻�";
//	}
//	public Practice_Class(String t, String a) {
//		title = t;
//		author = a;
//	}
//	
//	public static void main(String[] args) {
//		Practice_Class littlePrince = new Practice_Class("�����", "�������丮"); //������ Practice_Class(String t, String a) ȣ��
//		Practice_Class loveStory = new Practice_Class("������"); // ������ Practice_Class(String t ȣ��)
//		System.out.println(littlePrince.title + " " + littlePrince.author);
//		System.out.println(loveStory.title + " " + loveStory.author);
//	}
//}


















