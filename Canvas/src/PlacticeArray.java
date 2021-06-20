//public class PlacticeArray {
//	public static void main(String[] args) {
//		double score[] [] = {{3.3, 3.4}, //1학년 1, 2 학기 평점
//							{3.5, 3.6},	// 2학년 1, 2 학기 평점
//							{3.7, 4.0}, // 3학년 1, 2 학기 평점
//							{4.1, 4.2}};	// 4학년 1, 2 학기 평점
//		double sum=0;
//		for(int year=0; year<score.length; year ++) {  //각학년별로 반복 
//		 for(int term = 0; term<score[year].length; term++) {  // 학기별로 반복
//			 sum += score[year][term]; //전체 평점 합
//		 }
//		}
//		int n = score.length;
//		int m = score[0].length;
//		System.out.println("4학년 전체 평균은" + sum/(n*m));
//	}
//}

//public class PlacticeArray {
//	public static void main(String[] args) {
//		int intArray[][] = new int[4][]; // 각 행의 레퍼런스 배열 생성
//		intArray[0] = new int[3]; // 첫째 행의 정수 3개의 배열 생성
//		intArray[1] = new int[2]; // 둘째 행의 정수 2개의 배열 생성
//		intArray[2] = new int[3]; // 셋째 행의 정수 3개의 배열 생성
//		intArray[3] = new int[2]; // 넷째 행의 정수 2개의 배열 생성
//		
//		for(int i=0; i <intArray.length; i++) { //행에 대한 반복
//			for(int j=0; j<intArray[i].length; j++) { //열에 대한 반복
//				intArray[i][j] = (i+1)*10 + j;
//			}
//		}
//		for(int i=0; i<intArray.length; i++) {
//			for(int j=0; j<intArray[i].length; j++) {
//				System.out.print(intArray[i][j]+ " ");
//			}System.out.println(); // 다음 줄로 넘어가기
//		} 
//	}
//}

//public class PlacticeArray {
//	static int[] makeArray() {
//		int temp[] = new int[4];
//		for(int i=0; i<temp.length; i++) { 
//			temp[i] = i; //배열의 원소를 0,1,2,3으로 초기화
//		}return temp;
//	}
//	
//	public static void main(String[] args) {
//		int intArray[]; // 배열 레퍼런스 변수 선언
//		intArray = makeArray(); // 메소드로부터 ㅐ열을 전달받음
//		for(int i=0; i<intArray.length; i++) {
//			System.out.print(intArray[i] + " "); // 배열 모든 원소 출력
//		}
//	}
//}

//import java.util.Scanner;
//
//public class PlacticeArray { // DevideByZeroHandling
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
//	public class PlacticeArray {  //InputException
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

//public class PlacticeArray {      //NumException
//	public static void main (String[] args) {
//		String[] stringNumber = {"23", "12", "3.141592", "998"}; 
//		int i=0;
//		try {
//			for (i=0; i<stringNumber.length; i++) {
//				int j = Integer.parseInt(stringNumber[i]);
//				System.out.println("숫자로 변환된 값은 " + j);
//			}
//		}
//		catch (NumberFormatException e) {
//			System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
//		}
//	}
//}






