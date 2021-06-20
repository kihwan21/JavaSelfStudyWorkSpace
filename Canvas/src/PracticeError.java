//import java.util.Scanner;
//
//public class PracticeError { // DevideByZeroHandling
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		while(true) {
//			System.out.print("나뉨수를 입력하시오:"); 
//			int dividend = scanner.nextInt(); // 나뉨수 입력
//			System.out.print("나눗수를 입력하시오:"); 
//			int divisor = scanner.nextInt(); // 나눗수 입력
//			try {
//				System.out.println(dividend + "를 "+ divisor + "로 나누면 몫은" + dividend/divisor + "입니다.");
//				break; // 정상적인 나누기 완료 후 while 벗어나기
//			}
//			catch(ArithmeticException e) { // ArithmeticException 예외 처리 코드
//				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
//			}
//		}
//		scanner.close();
//	}
//}

//import java.util.Scanner;
//import java.util.InputMismatchException;
//	public class PracticeError {  //InputException
//		public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("정수 3개를 입력하세요");
//		int sum=0, n=0;
//		for(int i=0; i<3; i++) {
//			System.out.print(i+">>");
//			try {
//				n = scanner.nextInt(); // 정수 입력
//			}
//			catch(InputMismatchException e) {
//				System.out.println("정수가 아닙니다. 다시 입력하세요!");
//				scanner.next(); // 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
//				i--; // 인덱스가 증가하지 않도록 미리 감소
//				continue; // 다음 루프
//			}
//			sum += n; // 합하기
//		}
//		System.out.println("합은 " + sum);
//		scanner.close();
//	}
//}


public class PracticeError {      //NumException
	public static void main (String[] args) {
		String[] stringNumber = {"23", "12", "3.141592", "998"}; 
		int i=0;
		try {
			for (i=0; i<stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("숫자로 변환된 값은 " + j);
			}
		}
		catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
		}
	}
}
