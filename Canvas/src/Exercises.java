import java.util.Scanner;
 
interface Stack{
    int length();
    Object pop(); //삭제
    boolean push(Object ob); //삽입
}
 
class StringStack implements Stack{
    private String[] element;
    private int index;
 
    public StringStack(){ //초기화
        element = new String[10];
        index = 0;
    }
 
    public int length(){
        return element.length;
    }
 
    public Object pop(){
        if(element == null) {
            System.out.println("No element in stack.");
            return null;
        }
        else if(index == 0) return null;
        else{
            index --;
            return element[index];
        }
    }
 
    public boolean push(Object ob){
        if(index == length()) return false;
        else {
            element[index] = (String)ob;
            index++;
            return true;
        }
    }
 
}
 
 
public class Exercises {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Stack stack = new StringStack();
 
        System.out.println("Please input 10 elements.");
        for(int i=0; i<stack.length(); i++){
            if(stack.push(s.next()) == false) break;
        }
 
        System.out.println("Full stack. Now start 'pop'");
        for(int i=0; i<stack.length(); i++){
            System.out.print(stack.pop() + " ");
        }
 
    }
}
 

