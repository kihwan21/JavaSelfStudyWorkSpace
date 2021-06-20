import java.util.Scanner;
public class PracticeBreak {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit를 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine(); //한 라인 읽기  // next()도 되는 듯
			if (text.equals("exit")) {
				break;
			}
		}
		System.out.println("종료합니다.");
		scanner.close();
	}
}