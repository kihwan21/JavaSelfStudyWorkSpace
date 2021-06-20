//import java.util.Scanner;
//
//class Circle{
//	private double x, y;
//	private int radius;
//	public Circle(double x, double y, int radius) { // x, y, radius �ʱ�ȭ
//		this.x = x;
//		this.y = y;
//		this.radius = radius;
//	}
//	public void show() {
//		System.out.println("("+x+","+y+")"+radius);
//	}
//}
//
//public class classPractice {
//	public static void main(String args[]) {
//		Scanner scanner = new Scanner(System.in);
//		Circle c[] = new Circle[3]; // 3���� Circle �迭 ����
//		for(int i=0; i<c.length; i++) { //�迭�� ���� �� 3�� ������.
//			System.out.print("x, y, radius >>");
//			double x = scanner.nextDouble(); // x �� �б�
//		    double y = scanner.nextDouble(); // y �� �б�
//		    int radius = scanner.nextInt(); // ������ �б�
//		    c[i] = new Circle(x, y, radius); // Circle ��ü ���� ������ ��. 6���ڵ�ΰ�������.
//		}
//		for(int i=0; i<c.length; i++) {
//			c[i].show(); // ��� Circle ��ü ���
//		}
//		scanner.close();
//	}
//}

import java.util.Scanner;

class Circle{
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius) { // x, y, radius �ʱ�ȭ
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	public double getRedius() {
		return radius; //Math.OI�� 3,14
	}
}

public class classPractice {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3]; // 3���� Circle �迭 ����
		for(int i=0; i<c.length; i++) { //�迭�� ���� �� 3�� ������.
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble(); // x �� �б�
		    double y = scanner.nextDouble(); // y �� �б�
		    int radius = scanner.nextInt(); // ������ �б�
		    c[i] = new Circle(x, y, radius); // Circle ��ü ���� ������ �� 6���ڵ�ΰ�������.
		}
		int biggextIndex=0;
		for(int i=1; i<c.length; i++) {
			if(c[biggextIndex].getRedius() < c[i].getRedius()) {
				biggextIndex=i;
			}
		}
		biggextIndex=0;
		for(int i=1; i<c.length; i++) {
			if(c[biggextIndex].getRedius() < c[i].getRedius()) {
				biggextIndex=i;
			}
		}
		System.out.println("1. ���� ������ ū ����");
		c[biggextIndex].show();
		
		scanner.close();
	}
}

