//public class kkh_07_java {	
//	public static void main(String[] args) {
//		int array[][]= new int[4][4]; //�迭 ����
//
//		for(int i=0;i<array.length;i++) { 
//			for(int j=0;j<array.length;j++) {
//				array[i][j]=(int)(Math.random()*10+1);
//				System.out.print(array[i][j]+"\t");
//			}
//			System.out.println();
//		}
//	}
//}

public class kkh_07_java {	
	public static void main(String[] args) {
		int array[][]= new int[4][4]; //�迭 ����

		for(int i=0;i<array.length;i++) { 
			for(int j=0;j<array.length;j++) {
				array[i][j]=(int)(Math.random()*10+1); //�����ϰ� ���� ��.
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
