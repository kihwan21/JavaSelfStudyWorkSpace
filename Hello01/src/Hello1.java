//public class Hello1 {
//	public static void main(String[] args) {
//		double score[] [] = {{3.3, 3.4}, //1�г� 1, 2 �б� ����
//							{3.5, 3.6},	// 2�г� 1, 2 �б� ����
//							{3.7, 4.0}, // 3�г� 1, 2 �б� ����
//							{4.1, 4.2}};	// 4�г� 1, 2 �б� ����
//		double sum=0;
//		for(int year=0; year<score.length; year ++) {  //���г⺰�� �ݺ� 
//		 for(int term = 0; term<score[year].length; term++) {  // �б⺰�� �ݺ�
//			 sum += score[year][term]; //��ü ���� ��
//		 }
//		}
//		int n = score.length;
//		int m = score[0].length;
//		System.out.println("4�г� ��ü �����" + sum/(n*m));
//	}
//}

public class Hello1 {
	public static void main(String[] args) {
		double score[][] = {{1, 2}, {3, 4}};	// 4�г� 1, 2 �б� ����
		double sum=0;
		int year = 0;
		int term = 0;
		String name = "��";
		
		System.out.println(score.length);
		for(year=0; year<score.length; year ++) {  //���г⺰�� �ݺ�
			System.out.println(term<score[year].length);
			System.out.print(name);
		 for(term = 0; term<score[year].length; term++) {  // �б⺰�� �ݺ�
			 sum += score[year][term]; //��ü ���� ��
			 System.out.println(term<score[year].length);
		 }
		
		int n = score.length;
		int m = score[0].length;
		
		System.out.println(n);
		System.out.println(m);
		System.out.println(sum);
		System.out.println("4�г� ��ü �����" + sum/(n*m));
		}
	}
}	