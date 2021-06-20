//public class Practice_Class {
//	int radius; 		// 원의 반지름 필드
//	String name; 	
//	// 원의 이름 필드
//
//	public Practice_Class() { } 	// 원의 생성자
//	
//	public double getArea() { // 원의 면적 계산 메소드
//		return 3.14*radius*radius;
//	}
//
//	public static void main(String[] args) {
//		Practice_Class pizza; 			// 레퍼런스 변수 pizza 선언
//		pizza = new Practice_Class(); 		// Circle 객체 생성
//		pizza.radius = 10; 		// 피자의 반지름을 10으로 설정
//		pizza.name = "자바피자"; 	// 피자의 이름 설정
//		double area = pizza.getArea(); 	// 피자의 면적 알아내기
//		System.out.println(pizza.name + "의 면적은 " + area);
//		
//		Practice_Class donut = new Practice_Class(); 	// Circle 객체 생성 
//		donut.radius = 2; 		// 도넛의 반지름을 2로 설정
//		donut.name = "자바도넛"; 	// 도넛의 이름 설정
//		area = donut.getArea(); 		// 도넛의 면적 알아내기
//		System.out.println(donut.name + "의 면적은 " + area);
//	}
//}

import java.util.Scanner;

public class Practice_Class {
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Practice_Class rect = new Practice_Class (); // 객체 생성
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		scanner.close();
	}
}