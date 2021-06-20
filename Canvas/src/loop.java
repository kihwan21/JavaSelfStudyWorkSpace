
//public class loop {
//
//	public static void main(String[] args) {
//		int sum = 0;
//		int i;
//		for(i = 0; i <= 100; i++) {
//			sum += i;
//		} System.out.print(sum);
//	}
//}

//public class loop {
//	public static void main(String[] args) {
//		int sum = 0;
//		
//		for(int i=1; i <= 10; i++) {
//			sum +=i;
//			System.out.print(i); //더하는 수 출력
//			if(i<=9) { // 1 ~ 9 까지는 + 출력
//				System.out.print("+");
//			}else { //i 가 10인경우
//				System.out.print("="); // =를 출력하고
//				System.out.print(sum); // 덧셈결과 출력
//			}
//		}
//	}
//}

public class loop {
	public static void main(String[] args) {
		for(int i=2; i<10; i++) { //2단에서 9단
			for(int j=1; j<10; j++) { //구구셈 출력
				System.out.print(i + "*" + j + "=" + i*j); //구구셈 출력
				System.out.print('\t'); // 하나씩 탭으로 띄기
			}
			System.out.println(); //한 단이 끝나면 다음 줄로 커서 이동
		}
	}
}
