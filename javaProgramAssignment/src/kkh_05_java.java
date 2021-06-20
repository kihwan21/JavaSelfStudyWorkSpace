import java.util.Scanner;

public class kkh_05_java {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = scanner.next();  //문자열 읽기
		char c = s.charAt(0);       // 문자열의 첫 번째 문자
		
		for(int i=0; i<=c-'a'; i++) {
			for(char j='a'; j<=c-i; j++) {
				System.out.print(j);
			}
			System.out.println();
			scanner.close();
		}
	}
}