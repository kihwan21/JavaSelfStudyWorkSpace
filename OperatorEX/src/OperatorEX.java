import java.util.Scanner;

public class OperatorEX {
	public static void main(String[] args) {
		//비교연산
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int time = scanner.nextInt();
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) / 60;
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.println(second + "초입니다.");
		scanner.close();
		*/
		//
		
		//
		/*
		int a = 3, b = 3, c = 3;
		
		//대입 연산자 사례
		a += 3;
		b *= 3;
		c %= 2;
		System.out.println("a=" + a +", b=" + b + ", c=" + c);
		
		int d = 3;
		// 증감 연산자 사례
		a = d++;
		System.out.println("a=" + a + ", d=" + d);
		a = ++d;
		System.out.println("a=" + a + ", d=" + d);
		a = d--;
		System.out.println("a=" + a + ", d=" + d);
		a = --d;
		System.out.println("a=" + a + ", d=" + d);
		*/
		//
		
		
		// 비교 연산
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));

		// 비교 연산과 논리 연산 복합
		System.out.println((3 > 2) && (3 > 4));
		System.out.println((3 != 2) || (-1 > 0));
		System.out.println((3 != 2) ^ (-1 > 0));
		
		//
		
		/*
		short a = (short)0x55f;
		short b = (short)0x00ff;
		
		//비트 논리 연산
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n", (short)(a & b)); // 비트 AND
		System.out.printf("%04x\n", (short)(a | b)); // 비트 OR
		System.out.printf("%04x\n", (short)(a ^ b)); // 비트 XOR
		System.out.printf("%04x\n", (short)(~ a));   //비트 NOT
		
		byte c = 20; //0x14
		byte d = -8; // 0xf8
		
		//비트 시프트 연산
		System.out.println("[시프트 연산 결과]");
		System.out.println(c << 2); //c를 2비트 왼쪽 시프트
		System.out.println(c >> 2); //c를 2비트 오른쪽 시프트. 0 삽입
		System.out.println(d >> 2); //d를 2비트 오른쪽 시프트. 1 삽입
		System.out.printf("%x\n", (d >>> 2)); // d를 2비트 오른쪽 시프트, 0 삽입
		*/
	
	}
}
