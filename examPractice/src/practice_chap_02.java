import java.util.Scanner;

public class practice_chap_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int num = scanner.nextInt();
		
		if(num ==0 || num>=100 || num <=9) {
			System.out.println("범위가 아닙니다.");
		}
		
		else if(num/10 == num%10) {
			System.out.println("Yes! 10의자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("No! 10의 자리와 1의 자리가 같은 수를 입력하세요.");
		}
		scanner.close();
	}
}
