public interface Stack { //인터페이스
	int length(); // 현재 스택에 저장된 개수 리턴
	int capacity(); // 스택의 크기 리턴
	String pop(); // 스택의 톱(top)에 저장된 값 리턴
	boolean push(String val); //스택에 전달받은 스트링 넣기
}

//Stack 자료구조에서 반드시 구현해야 하는 메서드를 일종의 표준화된 메서드 리스트를 반드시 구현하라고는 의미 