//public class ArrayArray {
//
//	public static void main(String[] args) {
//		int intArray[][]= new int[5][5]; //�迭 ����
//		int sum =0;
//		double mean=0;
//
//		for(int i=0;i<intArray.length;i++) { 
//			for(int j=0;j<intArray.length;j++) {
//				intArray[i][j]=(int)(Math.random()*10+1); //�����ϰ� ���� ��.
//				System.out.print(intArray[i][j]+"\t");
//				sum += intArray[i][j];
//			}
//			System.out.println("");
//		}
//		mean = (double)sum/(double)(intArray.length* intArray[0].length);
//		System.out.println("===> intArray ��ҵ��� ��� ��"+mean);
//		
//		System.out.println("\n �������/�̻� ȿ >> ��հ�:"+ mean);
//		for(int i=0;i<intArray.length;i++) { 
//			for(int j=0;j<intArray.length;j++) {
//				if((double)intArray[i][j]>mean) {
//					System.out.print(intArray[i][j]+": ��" + "\t");
//					System.out.print(intArray[i][j]+"\t");
//				}
//				else {
//					System.out.print(intArray[i][j]+": ��" + "\t");
//					System.out.print(intArray[i][j]+"\t");
//				}
//				
//				System.out.println();
//				}
//		}
//	}
//}

public class ArrayArray {
	public static void main (String[] args) {
		int intArray[][] = new int[5][5];
		int sum=0;
		double mean=0;
		
		for (int i=0; i<intArray.length; i++)
			for (int j=0; j<intArray[i].length; j++) {
				intArray[i][j] = (int)(Math.random()*9 + 1); // 1���� 9������ ������ �� �����Ͽ� ����
				sum += intArray[i][j]; //������
			}
		mean = (double)sum/(double)(intArray.length* intArray[0].length); //���	
		//�� ���
		for (int i=0; i<intArray.length; i++) {
			for (int j=0; j<intArray[i].length; j++)
				System.out.print(intArray[i][j] + "\t");
			System.out.println();
		}
		System.out.println("==>> intArray ��ҵ��� ��� ��: " + mean);
		System.out.println();
		
		//��հ� ���Ͽ� �ش� ��ȣ ���: ��>��� -> ��,��<��� -> ��
		System.out.println("\n��� �̻�/���� ǥ >> ��հ�: " + + mean);
		for (int i=0; i<intArray.length; i++) {
			for (int j=0; j<intArray[i].length; j++)
				if((double)intArray[i][j]>mean)
					System.out.print(intArray[i][j]+": ��" + "\t");
				else
					System.out.print(intArray[i][j]+": ��" + "\t");
			System.out.println();
		}
	}
}

