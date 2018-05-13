package Problem7;

import java.util.Stack;

public class AppendStack {
	Stack<String> stack1 = new Stack<String>();
	Stack<String> stack2 = new Stack<String>();
	
	public void appendStack(String s){
		stack1.push(s);
	}
	
	public String DeleteHead() throws Exception {
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){   //��Ҫʹ��whileѭ����ջ1�е�Ԫ��ȫ����������ջ2
				stack2.push(stack1.pop());
			}
		}
		if(stack2.isEmpty()){
			throw new Exception("����Ϊ�գ����ܽ��в���...");
		}
		return stack2.pop();
	}
	
	public static void main(String[] args) throws Exception {
		AppendStack test = new AppendStack();
		test.appendStack("a");
	    System.out.println(test.DeleteHead());
	
		test.appendStack("b");
		test.appendStack("c");

	    System.out.println(test.DeleteHead());
		
	}
}
