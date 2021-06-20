import java.util.Scanner;

public class kkh_03_java {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("x1, y1의 좌표값을 입력해주세요");  
		System.out.print("x값은>>");
		int x1 = scanner.nextInt(); //x1 값을 받음
		System.out.print("y값은>>");
		int y1 = scanner.nextInt(); //y1 값을 받음
		
		System.out.println("x2, y2의 좌표값을 입력해주세요");
		System.out.print("x값은>>");
		int x2 = scanner.nextInt(); //x2의 값을 받음
		System.out.print("y값은>>");
		int y2 = scanner.nextInt(); //y2의 값을 받음
		
		if(x1 <=x2 && y1 <= y2) {  // 서로 비교
			System.out.print("직사각형이 서로 충돌합니다.");
		}
		else {
			System.out.print("직사각형이 서로 충돌하지 않습니다.");
		}
		scanner.close();
	}
}
