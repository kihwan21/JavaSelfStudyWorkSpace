import java.util.Scanner;

public class OperatorEX {
	public static void main(String[] args) {
		//�񱳿���
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int time = scanner.nextInt();
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) / 60;
		
		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð�, ");
		System.out.print(minute + "��, ");
		System.out.println(second + "���Դϴ�.");
		scanner.close();
		*/
		//
		
		//
		/*
		int a = 3, b = 3, c = 3;
		
		//���� ������ ���
		a += 3;
		b *= 3;
		c %= 2;
		System.out.println("a=" + a +", b=" + b + ", c=" + c);
		
		int d = 3;
		// ���� ������ ���
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
		
		
		// �� ����
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));

		// �� ����� ���� ���� ����
		System.out.println((3 > 2) && (3 > 4));
		System.out.println((3 != 2) || (-1 > 0));
		System.out.println((3 != 2) ^ (-1 > 0));
		
		//
		
		/*
		short a = (short)0x55f;
		short b = (short)0x00ff;
		
		//��Ʈ ���� ����
		System.out.println("[��Ʈ ���� ���]");
		System.out.printf("%04x\n", (short)(a & b)); // ��Ʈ AND
		System.out.printf("%04x\n", (short)(a | b)); // ��Ʈ OR
		System.out.printf("%04x\n", (short)(a ^ b)); // ��Ʈ XOR
		System.out.printf("%04x\n", (short)(~ a));   //��Ʈ NOT
		
		byte c = 20; //0x14
		byte d = -8; // 0xf8
		
		//��Ʈ ����Ʈ ����
		System.out.println("[����Ʈ ���� ���]");
		System.out.println(c << 2); //c�� 2��Ʈ ���� ����Ʈ
		System.out.println(c >> 2); //c�� 2��Ʈ ������ ����Ʈ. 0 ����
		System.out.println(d >> 2); //d�� 2��Ʈ ������ ����Ʈ. 1 ����
		System.out.printf("%x\n", (d >>> 2)); // d�� 2��Ʈ ������ ����Ʈ, 0 ����
		*/
	
	}
}