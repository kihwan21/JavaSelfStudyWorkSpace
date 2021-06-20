//import java.util.Scanner;
//
//class Circle{
//	private double x, y;
//	private int radius;
//	public Circle(double x, double y, int radius) { // x, y, radius 초기화
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
//		Circle c[] = new Circle[3]; // 3개의 Circle 배열 선언
//		for(int i=0; i<c.length; i++) { //배열의 길이 총 3번 돌도록.
//			System.out.print("x, y, radius >>");
//			double x = scanner.nextDouble(); // x 값 읽기
//		    double y = scanner.nextDouble(); // y 값 읽기
//		    int radius = scanner.nextInt(); // 반지름 읽기
//		    c[i] = new Circle(x, y, radius); // Circle 객체 생성 생성자 즉. 6번코드로가도록함.
//		}
//		for(int i=0; i<c.length; i++) {
//			c[i].show(); // 모든 Circle 객체 출력
//		}
//		scanner.close();
//	}
//}

import java.util.Scanner;

class Circle{
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius) { // x, y, radius 초기화
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	public double getRedius() {
		return radius; //Math.OI는 3,14
	}
}

public class classPractice {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3]; // 3개의 Circle 배열 선언
		for(int i=0; i<c.length; i++) { //배열의 길이 총 3번 돌도록.
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble(); // x 값 읽기
		    double y = scanner.nextDouble(); // y 값 읽기
		    int radius = scanner.nextInt(); // 반지름 읽기
		    c[i] = new Circle(x, y, radius); // Circle 객체 생성 생성자 쪽 6번코드로가도록함.
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
		System.out.println("1. 가장 면적인 큰 원음");
		c[biggextIndex].show();
		
		scanner.close();
	}
}

