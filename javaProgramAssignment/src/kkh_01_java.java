import java.util.Scanner;

public class kkh_01_java {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");  //입력 받기
		int num = scanner.nextInt();
		
		if(num<=9 || num > 100 || num == 0) {  //범위를 넘는거는 걸러내기
			System.out.println("10~99 값을 넣어주세요");
		}
		else if(num/10 == num%10) { //입력받는 값을 10으로 나누고 나머지와 서로 비교하기
			System.out.println("Yes! 10의자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("No! 10의 자리와 1의 자리가 같은 수를 입력하세요.");
		}
		scanner.close();		
	}
}
