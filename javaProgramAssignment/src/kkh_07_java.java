//public class kkh_07_java {	
//	public static void main(String[] args) {
//		int array[][]= new int[4][4]; //¹è¿­ ¼±¾ð
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
		int array[][]= new int[4][4]; //¹è¿­ ¼±¾ð

		for(int i=0;i<array.length;i++) { 
			for(int j=0;j<array.length;j++) {
				array[i][j]=(int)(Math.random()*10+1); //·»´ýÇÏ°Ô °ªÀ» ÁÜ.
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
