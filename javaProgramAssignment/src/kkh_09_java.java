import java.util.InputMismatchException;
import java.util.Scanner;

public class kkh_09_java {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		while(true) {
			try {
				System.out.print("곱하고자 하는 두 수 입력>>");
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				int result = x*y;
				System.out.println(x + "x" + y + "=" + result);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				scanner.next(); //이미 입력된 값을 지우기 위해서 사용함.
			}
		}
		scanner.close();
	}
}



